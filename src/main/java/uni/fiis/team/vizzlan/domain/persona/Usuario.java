package uni.fiis.team.vizzlan.domain.persona;

public class Usuario {
    private Integer cod;
    private String tipoIdentificacion;
    private String identificacion;
    private String Nombres;
    private String Apellidos;
    private String cuenta;
    private String contrasenia;

    public Usuario(Integer cod, String tipoIdentificacion, String identificacion, String Nombres, String Apellidos) {
        this.cod = cod;
        this.tipoIdentificacion = tipoIdentificacion;
        this.identificacion = identificacion;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
    }

    public Usuario(Integer cod, String cuenta, String contrasenia) {
        this.cod = cod;
        this.cuenta = cuenta;
        this.contrasenia = contrasenia;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
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

    
    
}
