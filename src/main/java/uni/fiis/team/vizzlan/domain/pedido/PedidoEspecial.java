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
public class PedidoEspecial extends Pedido{
    private Double costoAdicionalDecoracion;
    private Double pagoInicial;
    private Double montoTotalPagado;
    private Double deuda;

    public PedidoEspecial(Integer codigo, java.sql.Date fechaPedido, String tipo, String estadoPedido, String descripcion, String operador, Usuario comprador, Envio envio, CarritoDeCompra carroCompra) {
        super(codigo, fechaPedido, tipo, estadoPedido, descripcion, operador, comprador, envio, carroCompra);
    }

    public PedidoEspecial(Integer codigo, java.sql.Date fechaPedido, String tipo, String descripcion, String estadoPedido) {
        super(codigo, fechaPedido, tipo, descripcion, estadoPedido);
    }


  
    
}
