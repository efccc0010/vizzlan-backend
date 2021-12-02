package uni.fiis.team.vizzlan.request.producto;

public class CategoriaProductosRequest {
    private Integer codigoProducto;
    private String descripcionProducto;
    private Integer codigoCategoria;
    private String descripcionCategoria;

    public CategoriaProductosRequest(Integer codigoProducto, String descripcionProducto, Integer codigoCategoria, String descripcionCategoria) {
        this.codigoProducto = codigoProducto;
        this.descripcionProducto = descripcionProducto;
        this.codigoCategoria = codigoCategoria;
        this.descripcionCategoria = descripcionCategoria;
    }

    public Integer getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(Integer codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public Integer getCodigoCategoria() {
        return codigoCategoria;
    }

    public void setCodigoCategoria(Integer codigoCategoria) {
        this.codigoCategoria = codigoCategoria;
    }

    public String getDescripcionCategoria() {
        return descripcionCategoria;
    }

    public void setDescripcionCategoria(String descripcionCategoria) {
        this.descripcionCategoria = descripcionCategoria;
    }
}
