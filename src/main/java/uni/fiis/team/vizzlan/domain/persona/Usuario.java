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
    
    
}
