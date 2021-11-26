/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.fiis.team.vizzlan.domain.pedido;

import java.util.Date;
import uni.fiis.team.vizzlan.domain.persona.Usuario;

/**
 *
 * @author chiri
 */
public class PedidoNormal extends Pedido{
    
    public PedidoNormal(Integer codigo, Date fechaPedido, String estadoPedido, String descripcion, String operador, Usuario comprador, Envio envio, CarritoDeCompra carroCompra) {
        super(codigo, fechaPedido, estadoPedido, descripcion, operador, comprador, envio, carroCompra);
    }

    public PedidoNormal(Integer codigo, Date fechaPedido, String descripcion) {
        super(codigo, fechaPedido, descripcion);
    }
    
    
    
}
