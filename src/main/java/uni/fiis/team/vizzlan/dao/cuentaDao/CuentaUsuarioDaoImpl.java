package uni.fiis.team.vizzlan.dao.cuentaDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import uni.fiis.team.vizzlan.domain.cuentas.CuentaUsuario;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CuentaUsuarioDaoImpl implements CuentaUsuarioDao{
    @Autowired
    private JdbcTemplate template;

    @Override
    public List<CuentaUsuario> seleccionarCuentaUsuario() throws SQLException {
        List<CuentaUsuario> cuentaUsuarios = new ArrayList<>();
        Connection conn = template.getDataSource().getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(
                "SELECT cuenta, contrasenia FROM CuentaUsuario"
        );
        while(rs.next()){
            CuentaUsuario cuentaUser = new CuentaUsuario(rs.getString(1),rs.getString(2));
            cuentaUsuarios.add(cuentaUser);
        }
        rs.close();
        st.close();
        conn.close();
        return cuentaUsuarios;
    }
}
