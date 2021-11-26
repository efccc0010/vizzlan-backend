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
    public PedidoEspecial(Integer codigo, Date fechaPedido, String estadoPedido, String descripcion, String operador, Usuario comprador, Envio envio, CarritoDeCompra carroCompra) {
        super(codigo, fechaPedido, estadoPedido, descripcion, operador, comprador, envio, carroCompra);
    }

    public Double getCostoAdicionalDecoracion() {
        return costoAdicionalDecoracion;
    }

    public void setCostoAdicionalDecoracion(Double costoAdicionalDecoracion) {
        this.costoAdicionalDecoracion = costoAdicionalDecoracion;
    }

    public Double getPagoInicial() {
        return pagoInicial;
    }

    public void setPagoInicial(Double pagoInicial) {
        this.pagoInicial = pagoInicial;
    }

    public Double getMontoTotalPagado() {
        return montoTotalPagado;
    }

    public void setMontoTotalPagado(Double montoTotalPagado) {
        this.montoTotalPagado = montoTotalPagado;
    }

    public Double getDeuda() {
        return deuda;
    }

    public void setDeuda(Double deuda) {
        this.deuda = deuda;
    }
    
}
