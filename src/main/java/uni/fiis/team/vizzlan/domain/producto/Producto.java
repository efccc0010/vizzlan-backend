package uni.fiis.team.vizzlan.domain.producto;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


public class Producto {
    /** Atributos == Campos == Propiedades == Variables y constantes **/
    /* Variables de clase */
    /* Variables de instancia */


    private Integer codigoProducto;
    private String nombreProducto;
    private String categoriaProducto;
    private String tallaProducto;
    private Float precioProducto;
    private String colorProducto;
    private String modeloProducto;
    private String marcaProducto;
    private Date fechaIngreso;
    private Integer cantidadProducto;
    private String tipoColeccionProducto;
    private List<String> imagenReferencialProducto;
    private String descripcionProducto;
    private String comentarioProducto;

    /* Métodos de instancia (objetos) */
    /** Métodos == Mensajes == Operaciones **/
    /* Constructores : Se usa para instanciar (inicializar) objetos */

    public Producto(Integer codigoProducto, String nombreProducto, String categoriaProducto,
                    String tallaProducto, Float precioProducto, String colorProducto,
                    String modeloProducto, String marcaProducto, Date fechaIngreso,
                    Integer cantidadProducto, String tipoColeccionProducto,
                    List<String> imagenReferencialProducto,
                    String descripcionProducto, String comentarioProducto) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.categoriaProducto = categoriaProducto;
        this.tallaProducto = tallaProducto;
        this.precioProducto = precioProducto;
        this.colorProducto = colorProducto;
        this.modeloProducto = modeloProducto;
        this.marcaProducto = marcaProducto;
        this.fechaIngreso = fechaIngreso;
        this.cantidadProducto = cantidadProducto;
        this.tipoColeccionProducto = tipoColeccionProducto;
        this.imagenReferencialProducto = imagenReferencialProducto;
        this.descripcionProducto = descripcionProducto;
        this.comentarioProducto = comentarioProducto;
    }

    public Producto(Integer codigoProducto,String nombreProducto,Date fechaIngreso){
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.fechaIngreso = fechaIngreso;
    }
    /* Métodos de clase */
    /* Métodos de instancia (objetos) */

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

    public String getCategoriaProducto() {
        return categoriaProducto;
    }

    public void setCategoriaProducto(String categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }

    public String getTallaProducto() {
        return tallaProducto;
    }

    public void setTallaProducto(String tallaProducto) {
        this.tallaProducto = tallaProducto;
    }

    public Float getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(Float precioProducto) {
        this.precioProducto = precioProducto;
    }

    public String getColorProducto() {
        return colorProducto;
    }

    public void setColorProducto(String colorProducto) {
        this.colorProducto = colorProducto;
    }

    public String getModeloProducto() {
        return modeloProducto;
    }

    public void setModeloProducto(String modeloProducto) {
        this.modeloProducto = modeloProducto;
    }

    public String getMarcaProducto() {
        return marcaProducto;
    }

    public void setMarcaProducto(String marcaProducto) {
        this.marcaProducto = marcaProducto;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Integer getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(Integer cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public String getTipoColeccionProducto() {
        return tipoColeccionProducto;
    }

    public void setTipoColeccionProducto(String tipoColeccionProducto) {
        this.tipoColeccionProducto = tipoColeccionProducto;
    }

    public List<String> getImagenReferencialProducto() {
        return imagenReferencialProducto;
    }

    public void setImagenReferencialProducto(List<String> imagenReferencialProducto) {
        this.imagenReferencialProducto = imagenReferencialProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public String getComentarioProducto() {
        return comentarioProducto;
    }

    public void setComentarioProducto(String comentarioProducto) {
        this.comentarioProducto = comentarioProducto;
    }
}
