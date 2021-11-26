package uni.fiis.team.vizzlan.controller.pedidoController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import uni.fiis.team.vizzlan.domain.pedido.PedidoNormal;
import uni.fiis.team.vizzlan.service.pedidoService.PedidoService;

@RestController
public class PedidoController {
    
    @Autowired
    PedidoService pedidoService;
    
    @PostMapping("/registrarPedido")
    public String registroPedido(@RequestBody PedidoRequest pr) throws Exception{    
        PedidoNormal p = new PedidoNormal(pr.getCodigo(),pr.getFechaPedido(),pr.getDescripcion());
        pedidoService.realizarPedidoInicio(p);
        return "Ingreso Dado";
        
    }
}
