/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.fiis.team.vizzlan.controller.pedidoController;

import java.util.Date;

/**
 *
 * @author chiri
 */
class PedidoRequest {
    private Integer codigo ;
    private Date fechaPedido;
    private String descripcion;

    public PedidoRequest(Integer codigo, Date fechaPedido, String descripcion) {
        this.codigo = codigo;
        this.fechaPedido = fechaPedido;
        this.descripcion = descripcion;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
        
        
}
