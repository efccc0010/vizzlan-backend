package uni.fiis.team.vizzlan.domain.producto;

import java.util.List;

public class DisenioProducto {
    private Integer codigoDisenioProducto;
    private String descripcionDisenioProducto;
    private List<String> imagenDisenioProducto;

    public DisenioProducto(Integer codigoDisenioProducto, String descripcionDisenioProducto, List<String> imagenDisenioProducto) {
        this.codigoDisenioProducto = codigoDisenioProducto;
        this.descripcionDisenioProducto = descripcionDisenioProducto;
        this.imagenDisenioProducto = imagenDisenioProducto;
    }

    public Integer getCodigoDisenioProducto() {
        return codigoDisenioProducto;
    }

    public void setCodigoDisenioProducto(Integer codigoDisenioProducto) {
        this.codigoDisenioProducto = codigoDisenioProducto;
    }

    public String getDescripcionDisenioProducto() {
        return descripcionDisenioProducto;
    }

    public void setDescripcionDisenioProducto(String descripcionDisenioProducto) {
        this.descripcionDisenioProducto = descripcionDisenioProducto;
    }

    public List<String> getImagenDisenioProducto() {
        return imagenDisenioProducto;
    }

    public void setImagenDisenioProducto(List<String> imagenDisenioProducto) {
        this.imagenDisenioProducto = imagenDisenioProducto;
    }
}
