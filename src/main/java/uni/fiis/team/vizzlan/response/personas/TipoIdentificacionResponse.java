/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.fiis.team.vizzlan.response.personas;

/**
 *
 * @author chiri
 */
public class TipoIdentificacionResponse {
    private Integer idTipoMecanismoContacto;
    private String descripcion;

    public TipoIdentificacionResponse(Integer idTipoMecanismoContacto, String descripcion) {
        this.idTipoMecanismoContacto = idTipoMecanismoContacto;
        this.descripcion = descripcion;
    }

    public Integer getIdTipoMecanismoContacto() {
        return idTipoMecanismoContacto;
    }

    public void setIdTipoMecanismoContacto(Integer idTipoMecanismoContacto) {
        this.idTipoMecanismoContacto = idTipoMecanismoContacto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
