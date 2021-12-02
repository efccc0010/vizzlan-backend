package uni.fiis.team.vizzlan.request.personas;

import java.sql.Date;

public class MecanismoDeContactoRequest {

    private Integer  idMecanismoContacto;
    private Date  fechaInicio;
    private Date  fechaFin;
    private String  descripcion;
    private Integer  idTipoMecanismoContacto;
    private Integer  idParte;

    public MecanismoDeContactoRequest(Integer idMecanismoContacto, Date fechaInicio, Date fechaFin, String descripcion, Integer idTipoMecanismoContacto, Integer idParte) {
        this.idMecanismoContacto = idMecanismoContacto;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
        this.idTipoMecanismoContacto = idTipoMecanismoContacto;
        this.idParte = idParte;
    }

    public Integer getIdMecanismoContacto() {
        return idMecanismoContacto;
    }

    public void setIdMecanismoContacto(Integer idMecanismoContacto) {
        this.idMecanismoContacto = idMecanismoContacto;
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

    public Integer getIdTipoMecanismoContacto() {
        return idTipoMecanismoContacto;
    }

    public void setIdTipoMecanismoContacto(Integer idTipoMecanismoContacto) {
        this.idTipoMecanismoContacto = idTipoMecanismoContacto;
    }

    public Integer getIdParte() {
        return idParte;
    }

    public void setIdParte(Integer idParte) {
        this.idParte = idParte;
    }
}
