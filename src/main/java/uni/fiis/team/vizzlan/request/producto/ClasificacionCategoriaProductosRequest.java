package uni.fiis.team.vizzlan.request.producto;

import java.sql.Date;

public class ClasificacionCategoriaProductosRequest {
    private Date fechaInicio;
    private Date fechaFin;
    private String prioridad;
    private Integer idProducto;
    private Integer idCategoriaProducto;

    public ClasificacionCategoriaProductosRequest(Date fechaInicio, Date fechaFin, String prioridad, Integer idProducto, Integer idCategoriaProducto) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.prioridad = prioridad;
        this.idProducto = idProducto;
        this.idCategoriaProducto = idCategoriaProducto;
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

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Integer getIdCategoriaProducto() {
        return idCategoriaProducto;
    }

    public void setIdCategoriaProducto(Integer idCategoriaProducto) {
        this.idCategoriaProducto = idCategoriaProducto;
    }
}
