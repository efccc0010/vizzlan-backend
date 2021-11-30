package uni.fiis.team.vizzlan.domain.cuentas;

import java.util.Date;

public class CuentaUsuario {
    private String nicknameCuentaUsuario;
    private String contraseniaCuentaUsuario;
    private Date fechaRegistroCuentaUsuario;
    private Boolean activacionCuentaUsuario;
    private Boolean estadoCuentaUsuario;
    private String correoCuentaUsuario;

    public CuentaUsuario(String nicknameCuentaUsuario, String contraseniaCuentaUsuario,
                         Date fechaRegistroCuentaUsuario, Boolean activacionCuentaUsuario,
                         Boolean estadoCuentaUsuario, String correoCuentaUsuario) {
        this.nicknameCuentaUsuario = nicknameCuentaUsuario;
        this.contraseniaCuentaUsuario = contraseniaCuentaUsuario;
        this.fechaRegistroCuentaUsuario = fechaRegistroCuentaUsuario;
        this.activacionCuentaUsuario = activacionCuentaUsuario;
        this.estadoCuentaUsuario = estadoCuentaUsuario;
        this.correoCuentaUsuario = correoCuentaUsuario;
    }

    public CuentaUsuario(String nicknameCuentaUsuario, String contraseniaCuentaUsuario){
        this.nicknameCuentaUsuario = nicknameCuentaUsuario;
        this.contraseniaCuentaUsuario = contraseniaCuentaUsuario;
    }

    public String getNicknameCuentaUsuario() {
        return nicknameCuentaUsuario;
    }

    public void setNicknameCuentaUsuario(String nicknameCuentaUsuario) {
        this.nicknameCuentaUsuario = nicknameCuentaUsuario;
    }

    public String getContraseniaCuentaUsuario() {
        return contraseniaCuentaUsuario;
    }

    public void setContraseniaCuentaUsuario(String contraseniaCuentaUsuario) {
        this.contraseniaCuentaUsuario = contraseniaCuentaUsuario;
    }

    public Date getFechaRegistroCuentaUsuario() {
        return fechaRegistroCuentaUsuario;
    }

    public void setFechaRegistroCuentaUsuario(Date fechaRegistroCuentaUsuario) {
        this.fechaRegistroCuentaUsuario = fechaRegistroCuentaUsuario;
    }

    public Boolean getActivacionCuentaUsuario() {
        return activacionCuentaUsuario;
    }

    public void setActivacionCuentaUsuario(Boolean activacionCuentaUsuario) {
        this.activacionCuentaUsuario = activacionCuentaUsuario;
    }

    public Boolean getEstadoCuentaUsuario() {
        return estadoCuentaUsuario;
    }

    public void setEstadoCuentaUsuario(Boolean estadoCuentaUsuario) {
        this.estadoCuentaUsuario = estadoCuentaUsuario;
    }

    public String getCorreoCuentaUsuario() {
        return correoCuentaUsuario;
    }

    public void setCorreoCuentaUsuario(String correoCuentaUsuario) {
        this.correoCuentaUsuario = correoCuentaUsuario;
    }
}
