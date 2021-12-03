package uni.fiis.team.vizzlan.service.personaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uni.fiis.team.vizzlan.dao.personaDao.*;
import uni.fiis.team.vizzlan.request.personas.IdentificacionRequest;
import uni.fiis.team.vizzlan.request.personas.MecanismoDeContactoRequest;
import uni.fiis.team.vizzlan.request.personas.PersonaRequest;
import uni.fiis.team.vizzlan.request.personas.UsuarioRequest;
import uni.fiis.team.vizzlan.response.personas.ParteResponse;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import uni.fiis.team.vizzlan.response.personas.IdentificacionResponse;
import uni.fiis.team.vizzlan.response.personas.MecanismoDeContactoResponse;
import uni.fiis.team.vizzlan.response.personas.PersonasResponse;
import uni.fiis.team.vizzlan.response.personas.TipoIdentificacionResponse;
import uni.fiis.team.vizzlan.response.personas.TipoMecanismoContactoResponse;
import uni.fiis.team.vizzlan.response.personas.UsuarioResponse;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioDao usuarioDao;

    public PersonasResponse RegistrarDatosPersonalesService(PersonaRequest personaRequest) throws Exception {
        usuarioDao.RegistrarTipoParte(personaRequest);
        Integer codParte = usuarioDao.obtenerKey();
        usuarioDao.RegistrarDatosPersonales(codParte,personaRequest);
        PersonasResponse pr = new PersonasResponse(
                                                    codParte,
                                                    personaRequest.getTipo(),
                                                    personaRequest.getNombre(),
                                                    personaRequest.getApellido(),
                                                    personaRequest.getFechaNacimiento(),
                                                    personaRequest.getEdad(),
                                                    personaRequest.getGenero()
                                                );
        return pr;
    }

    public UsuarioResponse RegistroCuenta(UsuarioRequest usuarioRequest) throws Exception{
        usuarioDao.RegistroCuenta(usuarioRequest);
        Integer codUsuario = usuarioDao.obtenerKey();
        UsuarioResponse cu = new UsuarioResponse(codUsuario,usuarioRequest.getCuenta(),usuarioRequest.getContrasenia(),usuarioRequest.getIdParte());
        return cu;
    }
    
    public List<TipoMecanismoContactoResponse> mostrarTipoMecanismoContacto() throws SQLException{
        return usuarioDao.mostrarTipoMecanismoContacto();
    }
    
    public List<MecanismoDeContactoResponse> RegistrarContacto(List<MecanismoDeContactoRequest> mecanismoDeContactoRequest) throws Exception{
        List<MecanismoDeContactoResponse> mdcr = new ArrayList<>();
        for (MecanismoDeContactoRequest mcr:mecanismoDeContactoRequest){
            usuarioDao.RegistrarContacto(mcr);
            Integer codContacto = (Integer)usuarioDao.obtenerKey();
            MecanismoDeContactoResponse mcres = new MecanismoDeContactoResponse(codContacto,
                                                                                mcr.getFechaInicio(),
                                                                                mcr.getFechaFin(),
                                                                                mcr.getDescripcion(),
                                                                                mcr.getIdTipoMecanismoContacto(),
                                                                                mcr.getIdParte());
            mdcr.add(mcres);
        }
        return mdcr;
    }
    
     public List<TipoIdentificacionResponse> mostrarTipoIdentificacion() throws SQLException{
        return usuarioDao.mostrarTipoIdentificacion();
    }
     
    public List<IdentificacionResponse> RegistroIdentificacion(List<IdentificacionRequest> identificacionRequests) throws Exception{
        List<IdentificacionResponse> resp = new ArrayList<>();
        for (IdentificacionRequest ir:identificacionRequests){
            usuarioDao.RegistroIdentificacion(ir);
            Integer codIdentificacion = usuarioDao.obtenerKey();
            IdentificacionResponse irr = new IdentificacionResponse(codIdentificacion,
                                                                    ir.getFechaInicio(),
                                                                    ir.getFechaFin(),
                                                                    ir.getDescripcion(),
                                                                    ir.getIdTipoIdentificacion(),
                                                                    ir.getIdParte());
            resp.add(irr);
        }
        return resp;
    }

    public List<ParteResponse> mostrarParte() throws Exception{
        return usuarioDao.selectParte();
    }

            
}
