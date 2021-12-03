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
import java.util.List;
import uni.fiis.team.vizzlan.response.personas.TipoMecanismoContactoResponse;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioDao usuarioDao;

    private Integer codParte;
    private Integer codUsuario;
    private List<TipoMecanismoContactoResponse> listaTipoMecanismo;

    public PersonaRequest RegistrarDatosPersonalesService(PersonaRequest personaRequest) throws Exception {
        this.codParte = usuarioDao.RegistrarTipoParte(personaRequest);
        personaRequest.setIdParte(this.codParte);
        return personaRequest;
    }

    public UsuarioRequest RegistroCuenta(UsuarioRequest usuarioRequest) throws Exception{
        usuarioRequest.setIdParte(this.codParte);
        this.codUsuario = usuarioDao.RegistroCuenta(usuarioRequest);
        usuarioRequest.setIdCuentasUsuario(this.codUsuario);
        return usuarioRequest;
    }

    public List<MecanismoDeContactoRequest> RegistrarContacto(List<MecanismoDeContactoRequest> mecanismoDeContactoRequest) throws Exception{
        List<MecanismoDeContactoRequest> mdcr = new ArrayList<>();
        for (MecanismoDeContactoRequest mcr:mecanismoDeContactoRequest){
            Integer codMecanismo = usuarioDao.RegistrarContacto(mcr);
            mcr.setIdMecanismoContacto(codMecanismo);
            mdcr.add(mcr);
        }
        return  mdcr;
    }

    public String RegistroIdentificacion(List<IdentificacionRequest> identificacionRequests) throws Exception{
        for (IdentificacionRequest ir:identificacionRequests){
            usuarioDao.RegistroIdentificacion(ir);
        }
        return "Registro de identificacion completado correctamente";
    }

    public List<ParteResponse> mostrarParte() throws Exception{
        return usuarioDao.selectParte();
    }

    public List<TipoMecanismoContactoResponse> mostrarTipoMecanismoContacto()throws Exception{
        List<TipoMecanismoContactoResponse> lista = new ArrayList<>();
        this.listaTipoMecanismo = usuarioDao.mostrarTipoMecanismoContacto();
        return this.listaTipoMecanismo;
    }
            
}
