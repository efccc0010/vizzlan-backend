package uni.fiis.team.vizzlan.domain.persona;

public class Cliente extends Usuario{
    private String Direccion;
    private String Pais;
    private String Region;
    private String Provincia;
    private String Distrito;
    private Integer NumeroCelular;
    private String CodigoPostal;

    public Cliente(Integer DNI, String Nombres, String Apellidos, String Direccion, String Pais, String Region, String Provincia, String Distrito, Integer NumeroCelular, String CodigoPostal){
        super(DNI, Nombres, Apellidos);
        this.Direccion = Direccion;
        this.Pais = Pais;
        this.Region = Region;
        this.Provincia = Provincia;
        this.Distrito = Distrito;
        this.NumeroCelular =NumeroCelular;
        this.CodigoPostal = CodigoPostal;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getPais() {
        return Pais;
    }

    public String getRegion() {
        return Region;
    }

    public String getProvincia() {
        return Provincia;
    }

    public String getDistrito() {
        return Distrito;
    }

    public Integer getNumeroCelular() {
        return NumeroCelular;
    }

    public String getCodigoPostal() {
        return CodigoPostal;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public void setProvincia(String provincia) {
        Provincia = provincia;
    }

    public void setDistrito(String distrito) {
        Distrito = distrito;
    }

    public void setNumeroCelular(Integer numeroCelular) {
        NumeroCelular = numeroCelular;
    }

    public void setCodigoPostal(String codigoPostal) {
        CodigoPostal = codigoPostal;
    }
}
