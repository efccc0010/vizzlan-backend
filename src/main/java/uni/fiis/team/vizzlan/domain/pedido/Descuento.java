/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.fiis.team.vizzlan.domain.pedido;

/**
 *
 * @author chiri
 */
public class Descuento {
    private String idCupon;
    private String montoTotal;
    private Double costoTotalDescuento;
    private String tipoDescuento;
    private String porcentaje;

    public Descuento(String idCupon, String montoTotal, Double costoTotalDescuento, String tipoDescuento, String porcentaje) {
        this.idCupon = idCupon;
        this.montoTotal = montoTotal;
        this.costoTotalDescuento = costoTotalDescuento;
        this.tipoDescuento = tipoDescuento;
        this.porcentaje = porcentaje;
    }

    public String getIdCupon() {
        return idCupon;
    }

    public void setIdCupon(String idCupon) {
        this.idCupon = idCupon;
    }

    public String getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(String montoTotal) {
        this.montoTotal = montoTotal;
    }

    public Double getCostoTotalDescuento() {
        return costoTotalDescuento;
    }

    public void setCostoTotalDescuento(Double costoTotalDescuento) {
        this.costoTotalDescuento = costoTotalDescuento;
    }

    public String getTipoDescuento() {
        return tipoDescuento;
    }

    public void setTipoDescuento(String tipoDescuento) {
        this.tipoDescuento = tipoDescuento;
    }

    public String getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(String porcentaje) {
        this.porcentaje = porcentaje;
    }

    
}
