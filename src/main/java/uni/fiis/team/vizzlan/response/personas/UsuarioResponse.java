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
public class UsuarioResponse {
   private Integer idCuentasUsuario;
   private String cuenta;
   private String contrasenia;
   private Integer idParte;

    public UsuarioResponse(Integer idCuentasUsuario, String cuenta, String contrasenia, Integer idParte) {
        this.idCuentasUsuario = idCuentasUsuario;
        this.cuenta = cuenta;
        this.contrasenia = contrasenia;
        this.idParte = idParte;
    }

    public Integer getIdCuentasUsuario() {
        return idCuentasUsuario;
    }

    public void setIdCuentasUsuario(Integer idCuentasUsuario) {
        this.idCuentasUsuario = idCuentasUsuario;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Integer getIdParte() {
        return idParte;
    }

    public void setIdParte(Integer idParte) {
        this.idParte = idParte;
    }
   
   
}
