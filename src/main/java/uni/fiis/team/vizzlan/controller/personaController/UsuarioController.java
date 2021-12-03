package uni.fiis.team.vizzlan.controller.personaController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import uni.fiis.team.vizzlan.request.personas.IdentificacionRequest;
import uni.fiis.team.vizzlan.request.personas.MecanismoDeContactoRequest;
import uni.fiis.team.vizzlan.request.personas.PersonaRequest;
import uni.fiis.team.vizzlan.request.personas.UsuarioRequest;
import uni.fiis.team.vizzlan.response.personas.ParteResponse;
import uni.fiis.team.vizzlan.service.personaService.UsuarioService;

import java.util.List;
import uni.fiis.team.vizzlan.response.personas.IdentificacionResponse;
import uni.fiis.team.vizzlan.response.personas.MecanismoDeContactoResponse;
import uni.fiis.team.vizzlan.response.personas.PersonasResponse;
import uni.fiis.team.vizzlan.response.personas.TipoIdentificacionResponse;
import uni.fiis.team.vizzlan.response.personas.TipoMecanismoContactoResponse;
import uni.fiis.team.vizzlan.response.personas.UsuarioResponse;

@RestController
public class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/registrodatospersonalesprincipales")
    public PersonasResponse RegistrarDatosPersonalesController(@RequestBody PersonaRequest personaRequest) throws Exception {
        return usuarioService.RegistrarDatosPersonalesService(personaRequest);
    }
    
    @PostMapping("/registrocuentausuario")
    public UsuarioResponse RegistroCuenta(@RequestBody UsuarioRequest usuarioRequest) throws Exception{
        return usuarioService.RegistroCuenta(usuarioRequest);
    }
    
    @GetMapping("/mostrarTipoMecanismoContacto")
    public List<TipoMecanismoContactoResponse> mostrarTipoMecanismoContacto()throws Exception{
        return usuarioService.mostrarTipoMecanismoContacto();
    }
    
    @PostMapping("/registromecanismocontacto")
    public List<MecanismoDeContactoResponse> RegistrarContacto(@RequestBody List<MecanismoDeContactoRequest> mecanismoDeContactoRequest) throws Exception{
        return usuarioService.RegistrarContacto(mecanismoDeContactoRequest);
    }
    
    @GetMapping("/mostrarTipoIdentificacion")
    public List<TipoIdentificacionResponse> mostrarTipoidentificacion()throws Exception{
        return usuarioService.mostrarTipoIdentificacion();
    }
    
    @PostMapping("/registroidentificacion")
    public List<IdentificacionResponse> RegistroIdentificacion(@RequestBody List<IdentificacionRequest> identificacionRequests) throws Exception{
        return usuarioService.RegistroIdentificacion(identificacionRequests);
    }
    
    @GetMapping("/mostrarlistausuario")
    public List<ParteResponse> mostrarUsuario()throws Exception{
        return usuarioService.mostrarParte();
    }
    
}
