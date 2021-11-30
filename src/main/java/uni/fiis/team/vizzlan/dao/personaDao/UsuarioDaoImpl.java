package uni.fiis.team.vizzlan.dao.personaDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Repository
public class UsuarioDaoImpl implements UsuarioDao {

    @Autowired
    private JdbcTemplate template;

    @Override
    public void RegistrarTipoParte(Integer idp, String tip) throws SQLException {
        Connection conn = template.getDataSource().getConnection();
        String sql = "INSERT INTO parte VALUES(?,?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1,idp);
        pst.setString(2,tip);
        pst.executeUpdate();
        pst.close();
        conn.close();
    }

    @Override
    public void RegistrarDatosPersonales(PersonaRequest pr) throws SQLException {
        Connection conn = template.getDataSource().getConnection();
        String sql = "INSERT INTO personas VALUES(?,?,?,?,?,?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1,pr.getIdParte());
        pst.setString(2,pr.getNombre());
        pst.setString(3,pr.getApellido());
        pst.setDate(4,pr.getFechaNacimiento());
        pst.setString(5,pr.getEdad().toString());
        pst.setString(6,pr.getGenero());
        pst.executeUpdate();
        pst.close();
        conn.close();
    }

    @Override
    public void RegistroCuenta(UsuarioRequest ur) throws Exception {

    }

    @Override
    public void RelacionParteUsuario(Integer idParte, Integer idCuentasUsuarios) throws Exception {

    }

    @Override
    public void RegistrarContacto(MecanismoDeContactoRequest mcr) throws Exception {

    }

    @Override
    public void RelacionParteContacto(Integer idParte, Integer idMecanismosContacto) throws Exception {

    }

    @Override
    public void RegistroIdentificacion(IdentificacionRequest ir) throws Exception {

    }
}
