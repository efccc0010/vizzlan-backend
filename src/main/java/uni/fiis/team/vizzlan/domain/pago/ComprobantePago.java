package uni.fiis.team.vizzlan.domain.pago;

import java.util.Date;

public class ComprobantePago {
    private Integer CodComprobante;
    private Date FechaEmisor;
    private Integer CodUsuarioEmisor;
    private Float Monto;
    private String Descripcion;
    private Boolean Estado;

    public ComprobantePago(Integer codComprobante, Date fechaEmisor, Integer codUsuarioEmisor, Float monto, String descripcion, Boolean estado) {
        this.CodComprobante = codComprobante;
        this.FechaEmisor = fechaEmisor;
        this.CodUsuarioEmisor = codUsuarioEmisor;
        this.Monto = monto;
        this.Descripcion = descripcion;
        this.Estado = estado;
    }

    public Integer getCodComprobante() {
        return CodComprobante;
    }

    public Date getFechaEmisor() {
        return FechaEmisor;
    }

    public Integer getCodUsuarioEmisor() {
        return CodUsuarioEmisor;
    }

    public Float getMonto() {
        return Monto;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public Boolean getEstado() {
        return Estado;
    }

    public void setCodComprobante(Integer codComprobante) {
        CodComprobante = codComprobante;
    }

    public void setFechaEmisor(Date fechaEmisor) {
        FechaEmisor = fechaEmisor;
    }

    public void setCodUsuarioEmisor(Integer codUsuarioEmisor) {
        CodUsuarioEmisor = codUsuarioEmisor;
    }

    public void setMonto(Float monto) {
        Monto = monto;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public void setEstado(Boolean estado) {
        Estado = estado;
    }
}
