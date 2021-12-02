package uni.fiis.team.vizzlan.response.producto;

public class CategoriaProductoResponse {
    private Integer codigoCategoria;
    private String nombreCategoria;
    private Integer codigoSuperCategoria;

    public CategoriaProductoResponse(Integer codigoCategoria, String nombreCategoria, Integer codigoSuperCategoria) {
        this.codigoCategoria = codigoCategoria;
        this.nombreCategoria = nombreCategoria;
        this.codigoSuperCategoria = codigoSuperCategoria;
    }

    public Integer getCodigoCategoria() {
        return codigoCategoria;
    }

    public void setCodigoCategoria(Integer codigoCategoria) {
        this.codigoCategoria = codigoCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public Integer getCodigoSuperCategoria() {
        return codigoSuperCategoria;
    }

    public void setCodigoSuperCategoria(Integer codigoSuperCategoria) {
        this.codigoSuperCategoria = codigoSuperCategoria;
    }
}
