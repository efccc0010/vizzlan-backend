package uni.fiis.team.vizzlan.controller.pedidoController;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import uni.fiis.team.vizzlan.domain.pedido.Pedido;
import uni.fiis.team.vizzlan.domain.pedido.PedidoNormal;
import uni.fiis.team.vizzlan.service.pedidoService.PedidoService;

@RestController
public class PedidoController {
    
    @Autowired
    PedidoService pedidoService;
    
    @PostMapping("/agregarpedido")
    public String agregarPedido(@RequestBody PedidoRequest pr) throws Exception{    
        PedidoNormal p = new PedidoNormal(pr.getCodigo(),(Date)pr.getFechaPedido(),pr.getDescripcion());
        return pedidoService.realizarPedidoInicioService(p);
        
    }
    
    @GetMapping("/mostrar")
    public List<Pedido> mostrarPedido() throws SQLException{
        return pedidoService.mostrarProductos();
    }
}
