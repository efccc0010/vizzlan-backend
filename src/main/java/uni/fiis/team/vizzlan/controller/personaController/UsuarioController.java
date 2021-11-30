package uni.fiis.team.vizzlan.controller.personaController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import uni.fiis.team.vizzlan.dao.personaDao.PersonaRequest;
import uni.fiis.team.vizzlan.dao.personaDao.UsuarioDao;
import uni.fiis.team.vizzlan.service.personaService.UsuarioService;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/registrodatospersonalesprincipales")
    public String RegistrarDatosPersonalesController(@RequestBody PersonaRequest personaRequest) throws Exception {
        return usuarioService.RegistrarDatosPersonalesService(personaRequest);
        
    }

}
