package uni.fiis.team.vizzlan.service.personaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uni.fiis.team.vizzlan.dao.personaDao.PersonaRequest;
import uni.fiis.team.vizzlan.dao.personaDao.UsuarioDao;
import uni.fiis.team.vizzlan.dao.personaDao.UsuarioRequest;

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
}
