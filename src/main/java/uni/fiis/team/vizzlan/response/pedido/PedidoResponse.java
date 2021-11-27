/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.fiis.team.vizzlan.response.pedido;

import java.sql.Date;

/**
 *
 * @author chiri
 */
public class PedidoResponse {
    private Integer idPedido;
    private Date fechaInicio;
    private String tipo;
    private String descripcion;
    private String estimacionEntrega;
    private String estado;
    private Integer idUsuario;

    public PedidoResponse(Integer idPedido, Date fechaInicio, String tipo, String descripcion, String estimacionEntrega, String estado, Integer idUsuario) {
        this.idPedido = idPedido;
        this.fechaInicio = fechaInicio;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.estimacionEntrega = estimacionEntrega;
        this.estado = estado;
        this.idUsuario = idUsuario;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstimacionEntrega() {
        return estimacionEntrega;
    }

    public void setEstimacionEntrega(String estimacionEntrega) {
        this.estimacionEntrega = estimacionEntrega;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    
}
