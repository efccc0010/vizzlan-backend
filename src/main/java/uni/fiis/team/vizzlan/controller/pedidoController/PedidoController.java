package uni.fiis.team.vizzlan.controller.pedidoController;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class PedidoController {
    
    @Autowired
    PedidoService pedidoService;
    
    @PostMapping("/registrarPedido")
    public String registroPedido(@RequestBody PedidoRequest){
        
    }
}
