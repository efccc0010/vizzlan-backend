package uni.fiis.team.vizzlan.domain.producto;

import javax.persistence.Entity;
import javax.persistence.Id;


public class Almacen {

    private Integer codigoAlmacen;
    private Integer capacidadAlmacen;
    private String ubicacionAlmacen;
    private Integer codigoUsuarioCargoAlmacen;
    private Integer numeroPersonalAlmacen;

    public Almacen(Integer codigoAlmacen, Integer capacidadAlmacen, String ubicacionAlmacen, Integer codigoUsuarioCargoAlmacen, Integer numeroPersonalAlmacen) {
        this.codigoAlmacen = codigoAlmacen;
        this.capacidadAlmacen = capacidadAlmacen;
        this.ubicacionAlmacen = ubicacionAlmacen;
        this.codigoUsuarioCargoAlmacen = codigoUsuarioCargoAlmacen;
        this.numeroPersonalAlmacen = numeroPersonalAlmacen;
    }

    public Integer getCodigoAlmacen() {
        return codigoAlmacen;
    }

    public void setCodigoAlmacen(Integer codigoAlmacen) {
        this.codigoAlmacen = codigoAlmacen;
    }

    public Integer getCapacidadAlmacen() {
        return capacidadAlmacen;
    }

    public void setCapacidadAlmacen(Integer capacidadAlmacen) {
        this.capacidadAlmacen = capacidadAlmacen;
    }

    public String getUbicacionAlmacen() {
        return ubicacionAlmacen;
    }

    public void setUbicacionAlmacen(String ubicacionAlmacen) {
        this.ubicacionAlmacen = ubicacionAlmacen;
    }

    public Integer getCodigoUsuarioCargoAlmacen() {
        return codigoUsuarioCargoAlmacen;
    }

    public void setCodigoUsuarioCargoAlmacen(Integer codigoUsuarioCargoAlmacen) {
        this.codigoUsuarioCargoAlmacen = codigoUsuarioCargoAlmacen;
    }

    public Integer getNumeroPersonalAlmacen() {
        return numeroPersonalAlmacen;
    }

    public void setNumeroPersonalAlmacen(Integer numeroPersonalAlmacen) {
        this.numeroPersonalAlmacen = numeroPersonalAlmacen;
    }
}
