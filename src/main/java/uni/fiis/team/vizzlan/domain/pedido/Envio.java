/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.fiis.team.vizzlan.domain.pedido;

import java.util.Date;

/**
 *
 * @author chiri
 */
public class Envio {
    private Integer idEnvio;
    private Date fechaEnvio;
    private String estadoEnvio;
    private String tipoTransporte; 
    private String nombreTransporte;
    private String direccionEnvio;
    private String direccionReferencia;
    private String codPostal;
    private Double costoTotalTransporte;

    public Envio(Integer idEnvio, Date fechaEnvio, String estadoEnvio, String tipoTransporte, String nombreTransporte, String direccionEnvio, String direccionReferencia, String codPostal, Double costoTotalTransporte) {
        this.idEnvio = idEnvio;
        this.fechaEnvio = fechaEnvio;
        this.estadoEnvio = estadoEnvio;
        this.tipoTransporte = tipoTransporte;
        this.nombreTransporte = nombreTransporte;
        this.direccionEnvio = direccionEnvio;
        this.direccionReferencia = direccionReferencia;
        this.codPostal = codPostal;
        this.costoTotalTransporte = costoTotalTransporte;
    }
    
    public Integer getIdEnvio() {
        return idEnvio;
    }

    public void setIdEnvio(Integer idEnvio) {
        this.idEnvio = idEnvio;
    }

    public Date getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(Date fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public String getEstadoEnvio() {
        return estadoEnvio;
    }

    public void setEstadoEnvio(String estadoEnvio) {
        this.estadoEnvio = estadoEnvio;
    }

    public String getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public String getNombreTransporte() {
        return nombreTransporte;
    }

    public void setNombreTransporte(String nombreTransporte) {
        this.nombreTransporte = nombreTransporte;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public String getDireccionReferencia() {
        return direccionReferencia;
    }

    public void setDireccionReferencia(String direccionReferencia) {
        this.direccionReferencia = direccionReferencia;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public Double getCostoTotalTransporte() {
        return costoTotalTransporte;
    }

    public void setCostoTotalTransporte(Double costoTotalTransporte) {
        this.costoTotalTransporte = costoTotalTransporte;
    }
    
}
