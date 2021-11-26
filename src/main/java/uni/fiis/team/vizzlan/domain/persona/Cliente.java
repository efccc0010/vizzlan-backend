package uni.fiis.team.vizzlan.domain.persona;

public class Cliente extends Usuario{
    private String Direccion;
    private String Pais;
    private String Region;
    private String Provincia;
    private String Distrito;
    private Integer NumeroCelular;
    private String CodigoPostal;

    public Cliente(String Direccion, String Pais, String Region, String Provincia, String Distrito, Integer NumeroCelular, String CodigoPostal, Integer codPersona, Integer codUsuario, String tipoIdentificacion, String identificacion, String Nombres, String Apellidos, String cuenta, String contrasenia) {
        super(codPersona, codUsuario, tipoIdentificacion, identificacion, Nombres, Apellidos, cuenta, contrasenia);
        this.Direccion = Direccion;
        this.Pais = Pais;
        this.Region = Region;
        this.Provincia = Provincia;
        this.Distrito = Distrito;
        this.NumeroCelular = NumeroCelular;
        this.CodigoPostal = CodigoPostal;
    }

    public Cliente(String Direccion, String Pais, String Region, String Provincia, String Distrito, Integer NumeroCelular, String CodigoPostal, Integer codPersona, String Nombres) {
        super(codPersona, Nombres);
        this.Direccion = Direccion;
        this.Pais = Pais;
        this.Region = Region;
        this.Provincia = Provincia;
        this.Distrito = Distrito;
        this.NumeroCelular = NumeroCelular;
        this.CodigoPostal = CodigoPostal;
    }

    public Cliente(String Direccion, String Pais, String Region, String Provincia, String Distrito, Integer NumeroCelular, String CodigoPostal, Integer codUsuario, String cuenta, String contrasenia) {
        super(codUsuario, cuenta, contrasenia);
        this.Direccion = Direccion;
        this.Pais = Pais;
        this.Region = Region;
        this.Provincia = Provincia;
        this.Distrito = Distrito;
        this.NumeroCelular = NumeroCelular;
        this.CodigoPostal = CodigoPostal;
    }
    
    
}
