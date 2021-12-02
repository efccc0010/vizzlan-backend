

package uni.fiis.team.vizzlan.dao.personaDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import uni.fiis.team.vizzlan.response.personas.ParteResponse;
import uni.fiis.team.vizzlan.request.personas.PersonaRequest;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import uni.fiis.team.vizzlan.request.personas.UsuarioRequest;
import uni.fiis.team.vizzlan.request.personas.MecanismoDeContactoRequest;
@Repository
public class UsuarioDaoImpl implements UsuarioDao {

    @Autowired
    private JdbcTemplate template;

    @Override
    public Integer RegistrarTipoParte(PersonaRequest pr) throws SQLException {
        Connection conn = template.getDataSource().getConnection();
        String sql = "INSERT INTO parte(tipo) VALUES(?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1,pr.getTipo());
        pst.executeUpdate();
        pst.close();
        conn.close();
        return obtenerKey();
        
        
    }

    @Override
    public void RegistrarDatosPersonales(PersonaRequest pr) throws Exception {
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
    public Integer RegistroCuenta(UsuarioRequest ur) throws Exception {
        Connection conn = template.getDataSource().getConnection();
        String sql = "INSERT INTO cuentausuario(cuenta,contrasenia,idParte) VALUES (?,?,?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        
        pst.setString(1,ur.getCuenta());
        pst.setString(2,ur.getContrasenia());
        pst.setInt(3,ur.getIdParte());
        pst.executeUpdate();
        pst.close();
        conn.close();
        
        return obtenerKey();
    }

    @Override
    public Integer RegistrarContacto(MecanismoDeContactoRequest mcr) throws Exception {
        Connection conn = template.getDataSource().getConnection();
        String sql = "INSERT INTO mecanismocontacto(fechaInicio,fechaFin,descripcion,idTipoMecanismoContacto,idParte) VALUES(?,?,?,?,?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setDate(1,mcr.getFechaInicio());
        pst.setDate(2,mcr.getFechaFin());
        pst.setString(3,mcr.getDescripcion());
        pst.setInt(4,mcr.getIdTipoMecanismoContacto());
        pst.setInt(5,mcr.getIdParte());
        pst.executeUpdate();
        pst.close();
        conn.close();
        
        return obtenerKey();
    }

    @Override
    public void RegistroIdentificacion(uni.fiis.team.vizzlan.request.personas.IdentificacionRequest ir) throws Exception {
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
    
    public Integer obtenerKey() throws SQLException{
        Connection conn = template.getDataSource().getConnection();
        String sql = "select last_insert_id()";
        Statement st = conn.createStatement();
        
        ResultSet rs = st.executeQuery(sql);
        rs.next(); 
        Integer resp = rs.getInt(1);
        rs.close();
        st.close();
        conn.close();
        return resp;
    }
}
