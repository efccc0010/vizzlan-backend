package uni.fiis.team.vizzlan.dao.personaDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import uni.fiis.team.vizzlan.domain.persona.ParteResponse;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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
        String sql = "INSERT INTO personaidentificacion VALUES(?,?,?,?,?,?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1,ir.getIdPersonaIdentificacion());
        pst.setDate(2,ir.getFechaInicio());
        pst.setDate(3,ir.getFechaFin());
        pst.setString(4,ir.getDescripcion());
        pst.setInt(5,ir.getIdTipoIdentificacion());
        pst.setInt(6,ir.getIdParte());
        pst.executeUpdate();
        pst.close();
        conn.close();
    }

    @Override
    public List<ParteResponse> selectParte() throws SQLException{
        List<ParteResponse> resp = new ArrayList<>();
        Connection conn = template.getDataSource().getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT  p.nombre, \n" +
                "\t\tp.apellido, \n" +
                "\t\tp.fechaNacimiento, \n" +
                "\t\tp.edad, \n" +
                "\t\tp.genero, \n" +
                "        pa.tipo,\n" +
                "        cu.cuenta,\n" +
                "        mc.descripcion as correo,\n" +
                "        pi.descripcion as dni\n" +
                "FROM personas as p \n" +
                "INNER JOIN parte as pa \n" +
                "\tON pa.idParte = p.idParte\n" +
                "INNER JOIN cuentausuario as cu \n" +
                "\tON cu.idParte = p.idParte\n" +
                "INNER JOIN mecanismocontacto as mc \n" +
                "\tON mc.idParte = pa.idParte\n" +
                "INNER JOIN tipomecanismocontacto as tmc \n" +
                "\tON tmc.idTipoMecanismoContacto = mc.idTipoMecanismoContacto\n" +
                "INNER JOIN personaidentificacion as pi\n" +
                "\tON pi.idParte = p.idParte\n" +
                "INNER JOIN tipoidentificacion as ti \n" +
                "\tON ti.idTipoIdentificacion = pi.idTipoIdentificacion\n" +
                "WHERE tmc.descripcion = \"GMAIL\" and ti.descripcion = \"DNI\"");
        while(rs.next()){
            ParteResponse dept = new ParteResponse(
                    rs.getString(1),
                    rs.getString(2),
                    rs.getDate(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getString(8),
                    rs.getString(9)
            );
            resp.add(dept);
        }
        rs.close();
        st.close();
        conn.close();
        return resp;
    }
}
