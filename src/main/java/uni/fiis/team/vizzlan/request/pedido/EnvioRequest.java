/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.fiis.team.vizzlan.request.pedido;

/**
 *
 * @author chiri
 */
public class EnvioRequest {
    
    private Integer idPedido;
    private Integer idEnvio;
    private String tipoEnvio; 
    private String direccion; 
    private Float costo; 
    private String estimacionEntrega; 
    private String medioTransporte; 
    private String tipoMedio; 
    private String estadoEnvio; 
    private String terminosEnvio;

    public EnvioRequest(Integer idPedido, Integer idEnvio, String tipoEnvio, String direccion, Float costo, String estimacionEntrega, String medioTransporte, String tipoMedio, String estadoEnvio, String terminosEnvio) {
        this.idPedido = idPedido;
        this.idEnvio = idEnvio;
        this.tipoEnvio = tipoEnvio;
        this.direccion = direccion;
        this.costo = costo;
        this.estimacionEntrega = estimacionEntrega;
        this.medioTransporte = medioTransporte;
        this.tipoMedio = tipoMedio;
        this.estadoEnvio = estadoEnvio;
        this.terminosEnvio = terminosEnvio;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public Integer getIdEnvio() {
        return idEnvio;
    }

    public void setIdEnvio(Integer idEnvio) {
        this.idEnvio = idEnvio;
    }

    public String getTipoEnvio() {
        return tipoEnvio;
    }

    public void setTipoEnvio(String tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Float getCosto() {
        return costo;
    }

    public void setCosto(Float costo) {
        this.costo = costo;
    }

    public String getEstimacionEntrega() {
        return estimacionEntrega;
    }

    public void setEstimacionEntrega(String estimacionEntrega) {
        this.estimacionEntrega = estimacionEntrega;
    }

    public String getMedioTransporte() {
        return medioTransporte;
    }

    public void setMedioTransporte(String medioTransporte) {
        this.medioTransporte = medioTransporte;
    }

    public String getTipoMedio() {
        return tipoMedio;
    }

    public void setTipoMedio(String tipoMedio) {
        this.tipoMedio = tipoMedio;
    }

    public String getEstadoEnvio() {
        return estadoEnvio;
    }

    public void setEstadoEnvio(String estadoEnvio) {
        this.estadoEnvio = estadoEnvio;
    }

    public String getTerminosEnvio() {
        return terminosEnvio;
    }

    public void setTerminosEnvio(String terminosEnvio) {
        this.terminosEnvio = terminosEnvio;
    }
    
    
}
