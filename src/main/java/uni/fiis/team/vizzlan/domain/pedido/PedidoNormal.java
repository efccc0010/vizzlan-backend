/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.fiis.team.vizzlan.domain.pedido;

import java.sql.Date;
import uni.fiis.team.vizzlan.domain.persona.Usuario;

/**
 *
 * @author chiri
 */
public class PedidoNormal extends Pedido{

    public PedidoNormal(Integer codigo, java.sql.Date fechaPedido, String tipo, String estadoPedido, String descripcion, String operador, Usuario comprador, Envio envio, CarritoDeCompra carroCompra) {
        super(codigo, fechaPedido, tipo, estadoPedido, descripcion, operador, comprador, envio, carroCompra);
    }

    public PedidoNormal(Integer codigo, java.sql.Date fechaPedido, String tipo, String descripcion, String estadoPedido) {
        super(codigo, fechaPedido, tipo, descripcion, estadoPedido);
    }

    
}
