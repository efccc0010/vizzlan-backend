/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.fiis.team.vizzlan.dao.pedidoDao;

import java.sql.SQLException;
import java.util.List;
import uni.fiis.team.vizzlan.domain.pedido.CarritoDeCompra;
import uni.fiis.team.vizzlan.domain.pedido.Envio;
import uni.fiis.team.vizzlan.domain.pedido.Pedido;
import uni.fiis.team.vizzlan.domain.pedido.PedidoNormal;
import uni.fiis.team.vizzlan.domain.persona.Usuario;
import uni.fiis.team.vizzlan.domain.producto.Producto;

/**
 *
 * @author chiri
 */
public interface PedidoDao {
    public void registroPedidoInicio(PedidoNormal p)throws Exception;
    //public void registroDetalleCarritoCompra(Integer cod,CarritoDeCompra cdp) throws Exception;
    public void registroProductoCompra(Integer sec,Integer cod,Producto pd) throws Exception;
    public void registroMontoTotal(Integer cod,Float cdp)throws Exception;
    public void registroEnvio(Integer cod,Envio env) throws Exception;
    public void relacionEnvioPedido(Integer cod, Envio env) throws Exception;
    public void registroDatosCliente (Integer cod,Integer cl) throws Exception;
    public List<Pedido> selectProductos() throws SQLException;
    
}
