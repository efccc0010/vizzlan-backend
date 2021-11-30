package uni.fiis.team.vizzlan.dao.personaDao;

public interface UsuarioDao {

    public void RegistrarTipoParte(Integer idParte, String tipo) throws Exception;
    public void RegistrarDatosPersonales(PersonaRequest pr) throws Exception;
    public void RegistroCuenta(UsuarioRequest ur) throws Exception;
    public void RelacionParteUsuario(Integer idParte, Integer idCuentasUsuarios) throws Exception;
    public void RegistrarContacto(MecanismoDeContactoRequest mcr) throws Exception;
    public void RelacionParteContacto(Integer idParte, Integer idMecanismosContacto) throws Exception;
    public void RegistroIdentificacion(IdentificacionRequest ir) throws Exception;

}
