/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.fiis.team.vizzlan.domain.pedido;

import java.util.ArrayList;
import java.util.List;
import uni.fiis.team.vizzlan.domain.producto.Producto;
import uni.fiis.team.vizzlan.domain.producto.ProductoRequest;

/**
 *
 * @author chiri
 */
public class CarritoDeCompraRequest {
     private Integer codPedido;
     private Integer idUsuario;
     private Float subTotal;
     private String estado;
     private List<ProductoRequest> listaProductosOrdenados = new ArrayList<>();

    public CarritoDeCompraRequest(Integer codPedido,Integer idUsuario, Float subTotal, String estado ,List<ProductoRequest> p) {
        this.codPedido = codPedido;
        this.idUsuario = idUsuario;
        this.subTotal = subTotal;
        this.estado = estado;
        this.listaProductosOrdenados = p;
    }

    public Integer getCodPedido() {
        return codPedido;
    }

    public void setCodPedido(Integer codPedido) {
        this.codPedido = codPedido;
    }

    public List<ProductoRequest> getListaProductosOrdenados() {
        return listaProductosOrdenados;
    }

    public void setListaProductosOrdenados(List<ProductoRequest> listaProductosOrdenados) {
        this.listaProductosOrdenados = listaProductosOrdenados;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Float getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Float subTotal) {
        this.subTotal = subTotal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<ProductoRequest> getListaProd() {
        return listaProductosOrdenados;
    }

    public void setListaProd(List<ProductoRequest> listaProd) {
        this.listaProductosOrdenados = listaProd;
    }
     

}
