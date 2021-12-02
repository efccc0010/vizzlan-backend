package uni.fiis.team.vizzlan.request.personas;

public class UsuarioRequest {

   private Integer idCuentasUsuario;
   private String cuenta;
   private String contrasenia;
   private Integer idParte;

    public UsuarioRequest(String cuenta, String contrasenia, Integer idParte) {
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
