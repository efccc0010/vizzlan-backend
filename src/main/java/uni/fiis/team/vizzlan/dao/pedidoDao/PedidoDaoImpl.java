/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.fiis.team.vizzlan.dao.pedidoDao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import uni.fiis.team.vizzlan.domain.pedido.Envio;
import uni.fiis.team.vizzlan.domain.pedido.EnvioRequest;
import uni.fiis.team.vizzlan.domain.pedido.Pedido;
import uni.fiis.team.vizzlan.domain.pedido.PedidoNormal;
import uni.fiis.team.vizzlan.domain.producto.Producto;
import uni.fiis.team.vizzlan.domain.producto.ProductoRequest;
import uni.fiis.team.vizzlan.response.pedido.PedidoResponse;


@Repository
public class PedidoDaoImpl implements PedidoDao{
    @Autowired
    private JdbcTemplate template;

    public void registroPedidoInicio(PedidoNormal p) throws Exception {
       
            Connection conn = template.getDataSource().getConnection();
            String sql = "INSERT INTO pedido(idPedido,fechaInicio,tipo,descripcion,estimacionEntrega,estado,idCuentasUsuario,idEnvio) values(?,?,?,?,?,?,?,?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1,p.getCodigo());
            pst.setDate(2,p.getFechaPedido());
            pst.setString(3,p.getTipo());
            pst.setString(4,p.getDescripcion());
            pst.setString(5,"24 horas");
            pst.setString(6,p.getEstadoPedido());
            
            Integer idCuentaUsuario = p.getComprador().getCodUsuario();
            pst.setInt(7,idCuentaUsuario);
            pst.setInt(8,0);
            
            /*pst.setInt(3,1);*/
            
            pst.executeUpdate();
            pst.close();
            conn.close();
       //To change body of generated methods, choose Tools | Templates.
    }

    public void registroProductoCompra(Integer cod,ProductoRequest pd) throws SQLException{
        Connection conn = template.getDataSource().getConnection();
        String sql = "INSERT INTO articulos_pedido VALUES (?,?,?,?,?,?,?,?,?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1,pd.getSEC());
        pst.setInt(2,cod);
        pst.setInt(3,pd.getIdProducto());
        pst.setInt(4,pd.getIdTipoCaracteristicasProducto());
        pst.setInt(5,pd.getCantidad());
        pst.setString(6, pd.getDescripcion());
        pst.setString(7, pd.getPrecioUnitario().toString());
        pst.setString(8,pd.getPrecioTotal().toString());
        pst.setString(9, pd.getTerminosCondiciones());
        pst.executeUpdate();
        pst.close();
        conn.close();
    }
        
    public void registroMontoTotal(Integer cod,Float montoSub) throws Exception{
        Connection conn =  template.getDataSource().getConnection();
        String sql = "UPDATE pedido SET montoTotal= ? WHERE idPedido = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setDouble(1,montoSub);
        pst.setInt(2,cod);
        pst.executeUpdate();
        pst.close();
        conn.close();
    }  
    
    @Override
    public void registroEnvio(EnvioRequest env) throws SQLException {
        Connection conn = template.getDataSource().getConnection();
        String sql = "INSERT INTO envio VALUES(?,?,?,?,?,?,?,?,?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1,env.getIdEnvio());
        pst.setString(2,env.getTipoEnvio());
        pst.setString(3,env.getDireccion());
        pst.setDouble(4,env.getCosto());
        pst.setString(5,env.getEstimacionEntrega());
        pst.setString(6,env.getMedioTransporte());
        pst.setString(7,env.getTipoMedio());
        pst.setString(8,env.getEstadoEnvio());
        pst.setString(9,env.getTerminosEnvio());
        pst.executeUpdate();
        pst.close();
        conn.close();
       //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void relacionEnvioPedido(Integer cod, EnvioRequest env) throws SQLException{
        Connection conn = template.getDataSource().getConnection();
        String sql = "UPDATE pedido SET idEnvio = ? WHERE idPedido = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1,cod);
        pst.setInt(2,env.getIdPedido());
        pst.executeUpdate();
        pst.close();
        conn.close(); 
        
    }
    
    @Override
    public void registroDatosCliente(Integer cod, Integer cl) throws SQLException {
        Connection conn = template.getDataSource().getConnection();
        String sql = "UPDATE pedido SET idCuentasUsuario = ? WHERE idPedido = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1,cl);
        pst.setInt(2,cod);  
        pst.executeUpdate();
        pst.close();
        conn.close();
         //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PedidoResponse> selectProductos() throws SQLException{
        List<PedidoResponse> resp = new ArrayList<>();
        Connection conn = template.getDataSource().getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT idPedido,fechaInicio,tipo,descripcion,estimacionEntrega,estado,idCuentasUsuario FROM Pedido");
        while(rs.next()){
            PedidoResponse dept = new PedidoResponse(
                    rs.getInt(1), 
                    rs.getDate(2), 
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getInt(7)       
            );
            resp.add(dept);
        }
        rs.close();
        st.close();
        conn.close();
        return resp;
    }
    
}
