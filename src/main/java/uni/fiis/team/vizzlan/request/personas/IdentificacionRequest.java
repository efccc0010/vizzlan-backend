package uni.fiis.team.vizzlan.request.personas;

import java.sql.Date;

public class IdentificacionRequest {
    private Date fechaInicio;
    private Date fechaFin;
    private String descripcion;
    private Integer idTipoIdentificacion;
    private Integer idParte;

    public IdentificacionRequest(Integer idPersonaIdentificacion, Date fechaInicio, Date fechaFin, String descripcion, Integer idTipoIdentificacion, Integer idParte) {

        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
        this.idTipoIdentificacion = idTipoIdentificacion;
        this.idParte = idParte;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getIdTipoIdentificacion() {
        return idTipoIdentificacion;
    }

    public void setIdTipoIdentificacion(Integer idTipoIdentificacion) {
        this.idTipoIdentificacion = idTipoIdentificacion;
    }

    public Integer getIdParte() {
        return idParte;
    }

    public void setIdParte(Integer idParte) {
        this.idParte = idParte;
    }
}
