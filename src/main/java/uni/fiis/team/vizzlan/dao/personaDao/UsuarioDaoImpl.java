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
        Connection conn = template.getDataSource().getConnection();
        String sql = "INSERT INTO cuentausuario VALUES(?,?,?,?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1,ur.getIdCuentasUsuario());
        pst.setString(2,ur.getCuenta());
        pst.setString(3,ur.getContrasenia());
        pst.setInt(4,ur.getIdParte());
        pst.executeUpdate();
        pst.close();
        conn.close();
    }

    @Override
    public void RegistrarContacto(MecanismoDeContactoRequest mcr) throws Exception {
        Connection conn = template.getDataSource().getConnection();
        String sql = "INSERT INTO mecanismocontacto VALUES(?,?,?,?,?,?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1,mcr.getIdMecanismoContacto());
        pst.setDate(2,mcr.getFechaInicio());
        pst.setDate(3,mcr.getFechaFin());
        pst.setString(4,mcr.getDescripcion());
        pst.setInt(5,mcr.getIdTipoMecanismoContacto());
        pst.setInt(6,mcr.getIdParte());
        pst.executeUpdate();
        pst.close();
        conn.close();
    }


    @Override
    public void RegistroIdentificacion(IdentificacionRequest ir) throws Exception {
        Connection conn = template.getDataSource().getConnection();
        String sql = "INSERT INTO personaidentificacion VALUES(?,?,?,?,?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setDate(1,ir.getFechaInicio());
        pst.setDate(2,ir.getFechaFin());
        pst.setString(3,ir.getDescripcion());
        pst.setInt(4,ir.getIdTipoIdentificacion());
        pst.setInt(5,ir.getIdParte());
        pst.executeUpdate();
        pst.close();
        conn.close();
    }
}
