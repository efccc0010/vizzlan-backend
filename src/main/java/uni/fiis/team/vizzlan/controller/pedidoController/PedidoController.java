package uni.fiis.team.vizzlan.controller.pedidoController;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import uni.fiis.team.vizzlan.domain.pedido.Pedido;
import uni.fiis.team.vizzlan.domain.pedido.PedidoNormal;
import uni.fiis.team.vizzlan.domain.pedido.PedidoRequest;
import uni.fiis.team.vizzlan.domain.persona.Usuario;
//<editor-fold defaultstate="collapsed" desc="comment">

//</editor-fold>
import uni.fiis.team.vizzlan.response.pedido.PedidoResponse;
import uni.fiis.team.vizzlan.service.pedidoService.PedidoService;


@RestController
public class PedidoController {
    
    @Autowired
    private PedidoService pedidoService;
    @Autowired
    private JdbcTemplate template;
    
    @PostMapping("/crearinstanciapedido")
    public String crearInstanciaPedido(@RequestBody PedidoRequest pr) throws Exception{    
        PedidoNormal p = new PedidoNormal(
                pr.getCodigo(),
                pr.getFechaPedido(),
                pr.getTipo(),
                pr.getDescripcion(),
                pr.getEstado()
        );
        
        Usuario u = new Usuario(
                pr.getIdCuentaUsuario(),
                pr.getCuenta(),
                pr.getContrasenia()
        );
        
        p.setComprador(u);
        
        String r = pedidoService.realizarPedidoInicioService(p);
        return "ok";
    }
    
    /*@PostMapping("/agregarlistaproductos")
    public String seleccionarProductosCarrito(@RequestParam Integer cod,@RequestBody CarritoDeCompraRequest lpro) throws Exception{
        pedidoService.registrarCarritoCompraService(cod, lpro);
        return "ok";
    }*/
    
    
    @GetMapping("/mostrar")
    public List<PedidoResponse> mostrarPedido() throws SQLException{
        return pedidoService.mostrarProductos();
    }
    
}
