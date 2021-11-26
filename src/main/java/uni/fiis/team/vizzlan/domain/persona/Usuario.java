package uni.fiis.team.vizzlan.domain.persona;

public class Usuario {
    private Integer DNI;
    private String Nombres;
    private String Apellidos;

    public Usuario(Integer DNI, String Nombres, String Apellidos){
        this.DNI = DNI;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
    }

    public Integer getDNI() {
        return DNI;
    }

    public String getNombres() {
        return Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

}
