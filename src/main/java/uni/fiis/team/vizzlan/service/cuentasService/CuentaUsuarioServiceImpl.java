package uni.fiis.team.vizzlan.service.cuentasService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import uni.fiis.team.vizzlan.dao.cuentaDao.CuentaUsuarioDao;
import uni.fiis.team.vizzlan.domain.cuentas.CuentaUsuario;

import java.sql.SQLException;
import java.util.List;

@Service
public class CuentaUsuarioServiceImpl implements CuentaUsuarioService {
    @Autowired
    private CuentaUsuarioDao cuentaUsuarioDao;

    @Override
    public List<CuentaUsuario> seleccionarCuentasUsuarios() throws SQLException {
        return cuentaUsuarioDao.seleccionarCuentaUsuario();
    }
}
