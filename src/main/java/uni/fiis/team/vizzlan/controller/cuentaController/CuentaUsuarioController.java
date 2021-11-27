package uni.fiis.team.vizzlan.controller.cuentaController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import uni.fiis.team.vizzlan.domain.cuentas.CuentaUsuario;
import uni.fiis.team.vizzlan.service.cuentasService.CuentaUsuarioService;

import java.sql.SQLException;
import java.util.List;

@RestController
public class CuentaUsuarioController {

    @Autowired
    private CuentaUsuarioService cuentaUsuarioService;

    @GetMapping("/cuentasusuarios")
    public List<CuentaUsuario> seleccionarCuentasUsuarios() throws SQLException{
        return cuentaUsuarioService.seleccionarCuentasUsuarios();
    }
}
