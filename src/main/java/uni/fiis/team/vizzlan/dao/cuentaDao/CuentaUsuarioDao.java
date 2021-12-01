package uni.fiis.team.vizzlan.dao.cuentaDao;

import uni.fiis.team.vizzlan.domain.cuentas.CuentaUsuario;
import uni.fiis.team.vizzlan.domain.persona.Usuario;

import java.sql.SQLException;
import java.util.List;

public interface CuentaUsuarioDao {
    List<CuentaUsuario> seleccionarCuentaUsuario() throws SQLException;
}
