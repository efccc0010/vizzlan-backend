package uni.fiis.team.vizzlan.controller.personaController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import uni.fiis.team.vizzlan.dao.personaDao.*;
import uni.fiis.team.vizzlan.service.personaService.UsuarioService;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/registrodatospersonalesprincipales")
    public String RegistrarDatosPersonalesController(@RequestBody PersonaRequest personaRequest) throws Exception {
        return usuarioService.RegistrarDatosPersonalesService(personaRequest);
        
    }
    @PostMapping("/registrocuentausuario")
    public String RegistroCuenta(@RequestBody UsuarioRequest usuarioRequest) throws Exception{
        return usuarioService.RegistroCuenta(usuarioRequest);
    }
    @PostMapping("/registromecanismocontacto")
    public String RegistrarContacto(@RequestBody List<MecanismoDeContactoRequest> mecanismoDeContactoRequests) throws Exception{
        return usuarioService.RegistrarContacto(mecanismoDeContactoRequests);
    }
    @PostMapping("/registroidentificacion")
    public String RegistroIdentificacion(@RequestBody List<IdentificacionRequest> identificacionRequests) throws Exception{
        return usuarioService.RegistroIdentificacion(identificacionRequests);
    }

}
