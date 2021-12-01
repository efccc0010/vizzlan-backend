package uni.fiis.team.vizzlan.domain.producto;

public class CaracteristicasProductosRequest {
    private Integer idTipoCaracteristicasProducto;
    private String descripcion;
    private String tipoCaracteristica;

    public CaracteristicasProductosRequest(Integer idTipoCaracteristicasProducto, String descripcion, String tipoCaracteristica) {
        this.idTipoCaracteristicasProducto = idTipoCaracteristicasProducto;
        this.descripcion = descripcion;
        this.tipoCaracteristica = tipoCaracteristica;
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
