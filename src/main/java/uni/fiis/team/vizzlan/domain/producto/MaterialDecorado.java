package uni.fiis.team.vizzlan.domain.producto;

public class MaterialDecorado {
    private Integer codigoMaterialDecorado;
    private String nombreMaterialDecorado;
    private Float precioMaterialDecorado;
    private Integer cantidadMaterialDecorado;

    public MaterialDecorado(Integer codigoMaterialDecorado, String nombreMaterialDecorado, Float precioMaterialDecorado, Integer cantidadMaterialDecorado) {
        this.codigoMaterialDecorado = codigoMaterialDecorado;
        this.nombreMaterialDecorado = nombreMaterialDecorado;
        this.precioMaterialDecorado = precioMaterialDecorado;
        this.cantidadMaterialDecorado = cantidadMaterialDecorado;
    }

    public Integer getCodigoMaterialDecorado() {
        return codigoMaterialDecorado;
    }

    public void setCodigoMaterialDecorado(Integer codigoMaterialDecorado) {
        this.codigoMaterialDecorado = codigoMaterialDecorado;
    }

    public String getNombreMaterialDecorado() {
        return nombreMaterialDecorado;
    }

    public void setNombreMaterialDecorado(String nombreMaterialDecorado) {
        this.nombreMaterialDecorado = nombreMaterialDecorado;
    }

    public Float getPrecioMaterialDecorado() {
        return precioMaterialDecorado;
    }

    public void setPrecioMaterialDecorado(Float precioMaterialDecorado) {
        this.precioMaterialDecorado = precioMaterialDecorado;
    }

    public Integer getCantidadMaterialDecorado() {
        return cantidadMaterialDecorado;
    }

    public void setCantidadMaterialDecorado(Integer cantidadMaterialDecorado) {
        this.cantidadMaterialDecorado = cantidadMaterialDecorado;
    }
}
