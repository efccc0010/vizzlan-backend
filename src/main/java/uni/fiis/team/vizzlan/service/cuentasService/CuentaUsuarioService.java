package uni.fiis.team.vizzlan.service.cuentasService;

import org.springframework.beans.factory.annotation.Autowired;
import uni.fiis.team.vizzlan.dao.cuentaDao.CuentaUsuarioDao;
import uni.fiis.team.vizzlan.domain.cuentas.CuentaUsuario;

import java.sql.SQLException;
import java.util.List;


public interface CuentaUsuarioService {
    public List<CuentaUsuario>   seleccionarCuentasUsuarios() throws SQLException;

}
