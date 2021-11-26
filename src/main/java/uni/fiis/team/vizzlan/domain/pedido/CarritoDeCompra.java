/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.fiis.team.vizzlan.domain.pedido;

import java.util.ArrayList;
import java.util.List;
import uni.fiis.team.vizzlan.domain.producto.Producto;

/**
 *
 * @author chiri
 */
public class CarritoDeCompra {
     private Integer idUsuario;
     private List<Producto> listaProd = new ArrayList<>();
     private Descuento descuento;
     private Float subTotal;
     private String estado;

    public CarritoDeCompra(Integer idUsuario, Descuento descuento, Float SubTotal, String estado) {
        this.idUsuario = idUsuario;
        this.descuento = descuento;
        this.subTotal = SubTotal;
        this.estado = estado;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public List<Producto> getListaProd() {
        return listaProd;
    }

    public void setListaProd(List<Producto> listaProd) {
        this.listaProd = listaProd;
    }

    public Descuento getDescuento() {
        return descuento;
    }

    public void setDescuento(Descuento descuento) {
        this.descuento = descuento;
    }

    public Float getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Float SubTotal) {
        this.subTotal = SubTotal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public void calcularSubtotal(){
        Float s = 0.0f;
        for (Producto pd : this.listaProd){
            s+=(float)pd.getCantidadProducto() * pd.getPrecioProducto();
        }
        this.subTotal = s; 
    }
     
}
