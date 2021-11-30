package uni.fiis.team.vizzlan.service.personaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uni.fiis.team.vizzlan.dao.personaDao.*;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioDao usuarioDao;

   
    public String RegistrarDatosPersonalesService(PersonaRequest personaRequest) throws Exception {
        usuarioDao.RegistrarTipoParte(personaRequest.getIdParte(), personaRequest.getTipo());
        usuarioDao.RegistrarDatosPersonales(personaRequest);
        return "Registro de datos personales completado correctamente";
    }

    public String RegistroCuenta(UsuarioRequest usuarioRequest) throws Exception{
        usuarioDao.RegistroCuenta(usuarioRequest);
        return  "Registro de cuenta completado correctamente";
    }

    public String RegistrarContacto(List<MecanismoDeContactoRequest> mecanismoDeContactoRequest) throws Exception{
        for (MecanismoDeContactoRequest mcr:mecanismoDeContactoRequest){
            usuarioDao.RegistrarContacto(mcr);
        }
        return  "Registro de mecanismo completado correctamente";
    }

    public String RegistroIdentificacion(List<IdentificacionRequest> identificacionRequests) throws Exception{
        for (IdentificacionRequest ir:identificacionRequests){
            usuarioDao.RegistroIdentificacion(ir);
        }
        return "Registro de identificacion completado correctamente";
    }
}
