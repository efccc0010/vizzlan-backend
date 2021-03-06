

package uni.fiis.team.vizzlan.dao.personaDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import uni.fiis.team.vizzlan.response.personas.ParteResponse;
import uni.fiis.team.vizzlan.request.personas.PersonaRequest;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import uni.fiis.team.vizzlan.request.personas.IdentificacionRequest;
import uni.fiis.team.vizzlan.request.personas.UsuarioRequest;
import uni.fiis.team.vizzlan.request.personas.MecanismoDeContactoRequest;
import uni.fiis.team.vizzlan.response.personas.MecanismoDeContactoResponse;
import uni.fiis.team.vizzlan.response.personas.TipoIdentificacionResponse;
import uni.fiis.team.vizzlan.response.personas.TipoMecanismoContactoResponse;
@Repository
public class UsuarioDaoImpl implements UsuarioDao {

    @Autowired
    private JdbcTemplate template;

    @Override
    public void RegistrarTipoParte(PersonaRequest pr) throws SQLException {
        Connection conn = template.getDataSource().getConnection();
        String sql = "INSERT INTO parte(tipo) VALUES(?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1,pr.getTipo());
        pst.executeUpdate();
        pst.close();
        conn.close();
    }

    @Override
    public void RegistrarDatosPersonales(Integer idparte,PersonaRequest pr) throws SQLException {
        Connection conn = template.getDataSource().getConnection();
        String sql = "INSERT INTO personas VALUES(?,?,?,?,?,?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1,idparte);
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
    public void RegistroCuenta(UsuarioRequest ur) throws SQLException {
        Connection conn = template.getDataSource().getConnection();
        String sql = "INSERT INTO cuentausuario(cuenta,contrasenia,idParte) VALUES (?,?,?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1,ur.getCuenta());
        pst.setString(2,ur.getContrasenia());
        pst.setInt(3,ur.getIdParte());
        pst.executeUpdate();
        pst.close();
        conn.close();
        
    }
    
    @Override
    public List<TipoMecanismoContactoResponse> mostrarTipoMecanismoContacto() throws SQLException{
        List<TipoMecanismoContactoResponse> res = new ArrayList<>();
        Connection conn = template.getDataSource().getConnection();
        Statement st = conn.createStatement();
        String sql = "select * from tipomecanismocontacto";
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()){
            TipoMecanismoContactoResponse tmcr = new TipoMecanismoContactoResponse(rs.getInt(1),rs.getString(2));
            res.add(tmcr);
        }
        rs.close();
        st.close();
        conn.close();
        return res;
    }
    @Override
    public void RegistrarContacto(MecanismoDeContactoRequest mcr) throws SQLException {
        Connection conn = template.getDataSource().getConnection();
        String sql = "INSERT INTO mecanismocontacto(fechaInicio,fechaFin,descripcion,idTipoMecanismoContacto,idParte) VALUES(?,?,?,?,?)";
        /*String sql = "INSERT INTO mecanismocontacto(descripcion,idTipoMecanismoContacto,idParte) VALUES(?,?,?)";*/
        PreparedStatement pst = conn.prepareStatement(sql);
        /*pst.setString(1,mcr.getDescripcion());
        pst.setInt(2,mcr.getIdTipoMecanismoContacto());
        pst.setInt(3,mcr.getIdParte());*/
        pst.setDate(1,(Date)mcr.getFechaInicio());
        pst.setDate(2,(Date)mcr.getFechaFin());
        pst.setString(3,mcr.getDescripcion());
        pst.setInt(4,mcr.getIdTipoMecanismoContacto());
        pst.setInt(5,mcr.getIdParte());
        pst.executeUpdate();
        pst.close();
        conn.close();
    }
    @Override
    public List<TipoIdentificacionResponse> mostrarTipoIdentificacion() throws SQLException{
        List<TipoIdentificacionResponse> res = new ArrayList<>();
        Connection conn = template.getDataSource().getConnection();
        Statement st = conn.createStatement();
        String sql = "select * from tipoidentificacion";
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()){
            TipoIdentificacionResponse tmcr = new TipoIdentificacionResponse(rs.getInt(1),rs.getString(2));
            res.add(tmcr);
        }
        rs.close();
        st.close();
        conn.close();
        return res;
    }
    @Override
    public void RegistroIdentificacion(IdentificacionRequest ir) throws SQLException {
        Connection conn = template.getDataSource().getConnection();
        String sql = "INSERT INTO personaidentificacion(fechaInicio,fechaFin,descripcion,idTipoIdentificacion,idParte) VALUES(?,?,?,?,?)";
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
        ResultSet rs = st.executeQuery("select *\n" +
                                        "from parte\n" +
                                        "inner join cuentausuario\n" +
                                        "	on cuentausuario.idParte = parte.idParte\n" +
                                        "inner join (select p.idParte,\n" +
                                        "			   p.nombre,\n" +
                                        "			   p.apellido,\n" +
                                        "			   p.fechaNacimiento,\n" +
                                        "			   p.edad,\n" +
                                        "			   p.genero,\n" +
                                        "			   r.valor,\n" +
                                        "			   r.tipo\n" +
                                        "		from personas as p\n" +
                                        "		left join (SELECT mc.idParte as parte,\n" +
                                        "						  mc.fechaInicio,\n" +
                                        "						  mc.fechaFin,\n" +
                                        "						  mc.descripcion as valor,\n" +
                                        "						  tmc.descripcion as tipo\n" +
                                        "					from mecanismocontacto as mc\n" +
                                        "					inner join tipomecanismocontacto as tmc\n" +
                                        "						on tmc.idTipoMecanismoContacto = mc.idTipoMecanismoContacto\n" +
                                        "					where tmc.descripcion = \"Correo electronico\") as r\n" +
                                        "		on r.parte = p.idParte) as k\n" +
                                        "on k.idParte = parte.idParte");
        while(rs.next()){
            ParteResponse dept = new ParteResponse(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(8),
                    rs.getString(9),
                    rs.getDate(10),
                    rs.getString(11),
                    rs.getString(12),
                    rs.getString(13),
                    rs.getString(4)
            );
            resp.add(dept);
        }
        rs.close();
        st.close();
        conn.close();
        return resp;
    }
    
    
    @Override
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
    
    @Override
    public Integer buscarTipoMecanismoContacto(String descripcion) throws SQLException{
        Connection conn = template.getDataSource().getConnection();
        String sql = "SELECT idTipoMecanismoContacto FROM tipomecanismocontacto WHERE descripcion LIKE '%" + descripcion + "'" ;
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        Integer cod = 0;
        while(rs.next()){
            cod = rs.getInt(1);
            break;
        }
        rs.close();
        st.close();
        conn.close();
        return cod;
    }
}
