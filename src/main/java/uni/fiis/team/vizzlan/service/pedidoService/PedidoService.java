package uni.fiis.team.vizzlan.service.pedidoService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uni.fiis.team.vizzlan.dao.pedidoDao.PedidoDao;
import uni.fiis.team.vizzlan.domain.pedido.CarritoDeCompra;
import uni.fiis.team.vizzlan.domain.pedido.Envio;
import uni.fiis.team.vizzlan.domain.pedido.Pedido;
import uni.fiis.team.vizzlan.domain.pedido.PedidoNormal;
import uni.fiis.team.vizzlan.domain.producto.Producto;

@Service
public class PedidoService {
    
    @Autowired
    PedidoDao pedidoDao;
    
    public String realizarPedidoInicioService (PedidoNormal p) throws Exception{
        pedidoDao.registroPedidoInicio(p);
        return "registro de pedido";
    }
    
    public String registrarCarritoCompraService (Integer cod,CarritoDeCompra cdp)throws Exception{
        List<Producto> lista = new ArrayList<>();
        lista = cdp.getListaProd();
        int sec = 0;
        
        for(Producto pd :lista){
            
            pedidoDao.registroProductoCompra(sec,cod, pd);
            sec++;
        }
        
        pedidoDao.registroMontoTotal(cod, cdp.getSubTotal());
        return "Registro de los Productos Guardados";
    }
    
    public String registroEnvioService(Integer cod,Envio env) throws Exception{
        pedidoDao.registroEnvio(cod, env);
        pedidoDao.relacionEnvioPedido(cod, env);
        return "registro de envio dado";
    }
    
    public String registroClienteService(Integer cod, Integer cl) throws Exception{
        pedidoDao.registroDatosCliente(cod, cl);
        return "registro de clientes";
    }
    
    
    public List<Pedido> mostrarProductos() throws SQLException{
        return pedidoDao.selectProductos();
    }
}
