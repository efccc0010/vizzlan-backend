/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.fiis.team.vizzlan.controller.pedidoController;

import javax.persistence.Entity;

/**
 *
 * @author chiri
 */
class IdeRequest {
    private Integer idTipoIdentificacion;
    private String descripcion;
            
    public IdeRequest(Integer idTipoIdentificacion, String descripcion) {
        this.idTipoIdentificacion = idTipoIdentificacion;
        this.descripcion = descripcion;
    }

    public Integer getIdTipoIdentificacion() {
        return idTipoIdentificacion;
    }

    public void setIdTipoIdentificacion(Integer idTipoIdentificacion) {
        this.idTipoIdentificacion = idTipoIdentificacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
