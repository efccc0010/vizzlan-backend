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
import uni.fiis.team.vizzlan.domain.persona.Usuario;
import uni.fiis.team.vizzlan.request.pedido.CarritoDeCompraRequest;
import uni.fiis.team.vizzlan.request.pedido.EnvioRequest;
import uni.fiis.team.vizzlan.request.producto.ProductoRequest;
import uni.fiis.team.vizzlan.response.pedido.DescuentoResponse;
import uni.fiis.team.vizzlan.response.pedido.PedidoResponse;

@Service
public class PedidoService {
    
    @Autowired
    private PedidoDao pedidoDao;
    
    
    public String realizarPedidoInicioService (PedidoNormal p) throws Exception{
        pedidoDao.registroPedidoInicio(p);
        Usuario u = p.getComprador();
        pedidoDao.registroDatosCliente(p.getCodigo(),u.getCodUsuario());
        return "registro de pedido";
    }
    
    public String registrarCarritoCompraService (CarritoDeCompraRequest cdp)throws Exception{
        List<ProductoRequest> listaProductos = new ArrayList<>(); 
        listaProductos = cdp.getListaProd();
        float s = 0.0f;
        float des = 0.0f;
        for (ProductoRequest p: listaProductos ){
            pedidoDao.registroProductoCompra(cdp.getCodPedido(),p);
            s += p.getPrecioTotal();
            if(cdp.getCupon()!=""){
                DescuentoResponse dr = pedidoDao.buscarDescuento(p.getIdProducto(),cdp.getCupon());
                Float porDescuento = Float.valueOf(dr.getPorcentaje().substring(0,dr.getPorcentaje().length()-1))/100;
                des += porDescuento*p.getPrecioUnitario();
            }   
        }
        
        pedidoDao.registroMontoTotal(cdp.getCodPedido(), s,des);
        return "ok";
    }
    
    public String registroEnvioService(Integer cod,EnvioRequest env) throws Exception{
        pedidoDao.registroEnvio(env);
        pedidoDao.relacionEnvioPedido(cod, env);
        return "registro de envio dado";
    }
    
    public String registroClienteService(Integer cod, Integer cl) throws Exception{
        pedidoDao.registroDatosCliente(cod, cl);
        return "registro de clientes";
    }
    
    public List<PedidoResponse> mostrarProductos() throws SQLException{
        return pedidoDao.selectProductos();
    }

}
