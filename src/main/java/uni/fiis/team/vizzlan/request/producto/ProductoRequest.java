/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.fiis.team.vizzlan.request.producto;

/**
 *
 * @author chiri
 */
public class ProductoRequest {
    private Integer SEC;
    private Integer idProducto;
    private Integer idTipoCaracteristicasProducto;
    private Integer cantidad;
    private String descripcion;
    private Float precioUnitario;
    private Float precioTotal;
    private String terminosCondiciones;

    public ProductoRequest(Integer SEC, Integer idProducto, Integer idTipoCaracteristicasProducto, Integer cantidad, String descripcion, Float precioUnitario, Float precioTotal, String terminosCondiciones) {
        this.SEC = SEC;
        this.idProducto = idProducto;
        this.idTipoCaracteristicasProducto = idTipoCaracteristicasProducto;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.precioTotal = precioTotal;
        this.terminosCondiciones = terminosCondiciones;
    }

    public Integer getSEC() {
        return SEC;
    }

    public void setSEC(Integer SEC) {
        this.SEC = SEC;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Integer getIdTipoCaracteristicasProducto() {
        return idTipoCaracteristicasProducto;
    }

    public void setIdTipoCaracteristicasProducto(Integer idTipoCaracteristicasProducto) {
        this.idTipoCaracteristicasProducto = idTipoCaracteristicasProducto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Float getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(Float precioTotal) {
        this.precioTotal = precioTotal;
    }

    public String getTerminosCondiciones() {
        return terminosCondiciones;
    }

    public void setTerminosCondiciones(String terminosCondiciones) {
        this.terminosCondiciones = terminosCondiciones;
    }

    
}
