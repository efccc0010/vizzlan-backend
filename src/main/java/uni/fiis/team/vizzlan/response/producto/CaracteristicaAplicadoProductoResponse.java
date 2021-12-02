package uni.fiis.team.vizzlan.response.producto;

import java.sql.Date;
import java.util.List;

public class CaracteristicaAplicadoProductoResponse {
    private Integer codigoProducto;
    private String nombreProducto;
    private Date fechaInscripcionProducto;
    private Date fechaCaducacionProducto;
    private Integer idTipoCaracteristicasProducto;
    private String descripcion;
    private String tipoCaracteristica;

    public CaracteristicaAplicadoProductoResponse(Integer codigoProducto, String nombreProducto, Date fechaInscripcionProducto, Date fechaCaducacionProducto, Integer idTipoCaracteristicasProducto, String descripcion, String tipoCaracteristica) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.fechaInscripcionProducto = fechaInscripcionProducto;
        this.fechaCaducacionProducto = fechaCaducacionProducto;
        this.idTipoCaracteristicasProducto = idTipoCaracteristicasProducto;
        this.descripcion = descripcion;
        this.tipoCaracteristica = tipoCaracteristica;
    }

    public Integer getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(Integer codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Date getFechaInscripcionProducto() {
        return fechaInscripcionProducto;
    }

    public void setFechaInscripcionProducto(Date fechaInscripcionProducto) {
        this.fechaInscripcionProducto = fechaInscripcionProducto;
    }

    public Date getFechaCaducacionProducto() {
        return fechaCaducacionProducto;
    }

    public void setFechaCaducacionProducto(Date fechaCaducacionProducto) {
        this.fechaCaducacionProducto = fechaCaducacionProducto;
    }

    public Integer getIdTipoCaracteristicasProducto() {
        return idTipoCaracteristicasProducto;
    }

    public void setIdTipoCaracteristicasProducto(Integer idTipoCaracteristicasProducto) {
        this.idTipoCaracteristicasProducto = idTipoCaracteristicasProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoCaracteristica() {
        return tipoCaracteristica;
    }

    public void setTipoCaracteristica(String tipoCaracteristica) {
        this.tipoCaracteristica = tipoCaracteristica;
    }
}
