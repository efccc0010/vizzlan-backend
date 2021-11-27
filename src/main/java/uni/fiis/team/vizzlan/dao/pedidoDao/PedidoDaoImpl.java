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
import uni.fiis.team.vizzlan.domain.pedido.Pedido;
import uni.fiis.team.vizzlan.domain.pedido.PedidoNormal;
import uni.fiis.team.vizzlan.domain.producto.Producto;
import uni.fiis.team.vizzlan.response.pedido.PedidoResponse;


@Repository
public class PedidoDaoImpl implements PedidoDao{
    @Autowired
    private JdbcTemplate template;

    public void registroPedidoInicio(PedidoNormal p) throws Exception {
       
            Connection conn = template.getDataSource().getConnection();
            String sql = "INSERT INTO pedido(idPedido,fechaInicio,tipo,descripcion,estimacionEntrega,estado,idCuentasUsuario) values(?,?,?,?,?,?,?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1,p.getCodigo());
            pst.setDate(2,p.getFechaPedido());
            pst.setString(3,p.getTipo());
            pst.setString(4,p.getDescripcion());
            pst.setString(5,"24 horas");
            pst.setString(6,p.getEstadoPedido());
            
            Integer idCuentaUsuario = p.getComprador().getCodUsuario();
            pst.setInt(7,idCuentaUsuario);
            
            /*pst.setInt(3,1);*/
            
            pst.executeUpdate();
            pst.close();
            conn.close();
       //To change body of generated methods, choose Tools | Templates.
    }

    public void registroProductoCompra(Integer sec,Integer cod,Producto pd) throws SQLException{
        Connection conn = template.getDataSource().getConnection();
        String sql = "INSERT INTO articulos_pedido(SEC,idPedido,idProducto,cantidad,descripcion,precioU,precioTotal) VALUES(?,?,?,?,?,?,?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1, sec);
        pst.setInt(2, cod);
        pst.setInt(3, pd.getCodigoProducto());
        pst.setInt(4, pd.getCantidadProducto());
        pst.setString(5,"---");
        pst.setString(6,pd.getPrecioProducto().toString());
        Float precioTotal = pd.getPrecioProducto()*(float)pd.getCantidadProducto();
        pst.setString(7,precioTotal.toString());
        pst.executeUpdate();
        pst.close();
        conn.close();
        
    }
        /*List<Producto> lista = new ArrayList<>();
        lista = cdp.getListaProd();
        int sec = 0;
        
        for(Producto pd :lista){
            /*private Integer idUsuario;
             private List<Producto> listaProd = new ArrayList<>();
             private Descuento descuento;
             private Double subTotal;
             private String estado;
            this.registroProductoCompra(sec, cod, pd);
            sec++;
        }
        */
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
    public void registroEnvio(Integer cod,Envio env) throws Exception {
        Connection conn = this.template.getDataSource().getConnection();
        String sql = "INSERT INTO envio(idEnvio,tipoEnvio,direccion,tipoMedio,estadoEnvio,medioTransporte) values(?,?,?,?,?,?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1,env.getIdEnvio());
        pst.setString(2,"envio de productos estandar");
        pst.setString(3,env.getDireccionEnvio());
        pst.setString(4,env.getTipoTransporte());
        pst.setString(4,env.getEstadoEnvio());
        pst.setString(6,env.getNombreTransporte());
        pst.executeUpdate();
        pst.close();
        conn.close();
        /*private Integer idEnvio;
        private String direccionEnvio;
        private String tipoTransporte; 
        private String estadoEnvio;
        private String nombreTransporte;*/
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void relacionEnvioPedido(Integer cod, Envio env) throws Exception{
        Connection conn = this.template.getDataSource().getConnection();
        String sql = "UPDATE pedido SET idEnvio= ? WHERE idPedido = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1,env.getIdEnvio());
        pst.setInt(2,cod);
        pst.executeUpdate();
        pst.close();
        conn.close(); 
    }
    
    @Override
    public void registroDatosCliente(Integer cod, Integer cl) throws Exception {
        Connection conn = template.getDataSource().getConnection();
        String sql = "UPDATE pedido SET idCuentasUsuario = ? WHERE idPedido = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1,cl);
        pst.setInt(2,cod);  
        pst.executeUpdate();
        pst.close();
        conn.close();
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
