/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.fiis.team.vizzlan.controller.pedidoController;

import java.sql.Date;

/**
 *
 * @author chiri
 */
class PedidoRequest {
    private Integer codigo;
    private String descripcion;
    private Date fechaPedido;

    public PedidoRequest(Integer codigo,String fechaPedido, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

  

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
}
