package uni.fiis.team.vizzlan.dao.personaDao;

import java.sql.Date;

public class PersonaRequest {
     private Integer idParte;
     private String     tipo;
     private String  nombre;
     private String  apellido;
     private java.sql.Date  fechaNacimiento;
     private Integer edad;
     private String   genero;

    public PersonaRequest(Integer idParte, String tipo, String nombre, String apellido, Date fechaNacimiento, Integer edad, String genero) {
        this.idParte = idParte;
        this.tipo = tipo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.genero = genero;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getIdParte() {
        return idParte;
    }

    public void setIdParte(Integer idParte) {
        this.idParte = idParte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public java.sql.Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = Date.valueOf(fechaNacimiento);
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
