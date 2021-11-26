/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.fiis.team.vizzlan.request.Pedido;

import java.sql.Date;


/**
 *
 * @author chiri
 */
class PedidoRequest {
    private Integer codigo;
    private Date fechaPedido;
    private String tipo;
    private String descripcion;
    private String estado;
    /*Usuario*/
    private Integer idCuentaUsuario;
    private String cuenta;
    private String contrasenia;

    public PedidoRequest(Integer codigo, String fechaPedido, String tipo, String descripcion, String estado, Integer idCuentaUsuario, String cuenta, String contrasenia) {
        this.codigo = codigo;
        this.fechaPedido = Date.valueOf(fechaPedido);
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.estado = estado;
        this.idCuentaUsuario = idCuentaUsuario;
        this.cuenta = cuenta;
        this.contrasenia = contrasenia;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getIdCuentaUsuario() {
        return idCuentaUsuario;
    }

    public void setIdCuentaUsuario(Integer idCuentaUsuario) {
        this.idCuentaUsuario = idCuentaUsuario;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    
    
    
    

    
}
