package uni.fiis.team.vizzlan.domain.persona;

public class Usuario {
    private Integer codPersona;
    private Integer codUsuario;
    private String tipoIdentificacion;
    private String identificacion;
    private String Nombres;
    private String Apellidos;
    private String cuenta;
    private String contrasenia;
    private String tipoMecanismoContacto;
    private String mecanismoContacto;

    public Usuario(Integer codPersona, Integer codUsuario, String tipoIdentificacion, String identificacion, String Nombres, String Apellidos, String cuenta, String contrasenia) {
        this.codPersona = codPersona;
        this.codUsuario = codUsuario;
        this.tipoIdentificacion = tipoIdentificacion;
        this.identificacion = identificacion;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.cuenta = cuenta;
        this.contrasenia = contrasenia;
    }

    public Usuario(Integer codPersona, String Nombres) {
        this.codPersona = codPersona;
        this.Nombres = Nombres;
    }

    public Usuario(Integer codUsuario, String cuenta, String contrasenia) {
        this.codUsuario = codUsuario;
        this.cuenta = cuenta;
        this.contrasenia = contrasenia;
    }

    public Integer getCodPersona() {
        return codPersona;
    }

    public void setCodPersona(Integer codPersona) {
        this.codPersona = codPersona;
    }

    public Integer getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Integer codUsuario) {
        this.codUsuario = codUsuario;
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

    public String getTipoMecanismoContacto() {
        return tipoMecanismoContacto;
    }

    public void setTipoMecanismoContacto(String tipoMecanismoContacto) {
        this.tipoMecanismoContacto = tipoMecanismoContacto;
    }

    public String getMecanismoContacto() {
        return mecanismoContacto;
    }

    public void setMecanismoContacto(String mecanismoContacto) {
        this.mecanismoContacto = mecanismoContacto;
    }
    
    
}
