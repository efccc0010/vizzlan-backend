package uni.fiis.team.vizzlan.dao.personaDao;

import uni.fiis.team.vizzlan.response.personas.ParteResponse;
import uni.fiis.team.vizzlan.request.personas.IdentificacionRequest;
import uni.fiis.team.vizzlan.request.personas.MecanismoDeContactoRequest;
import uni.fiis.team.vizzlan.request.personas.PersonaRequest;
import uni.fiis.team.vizzlan.request.personas.UsuarioRequest;
import uni.fiis.team.vizzlan.response.personas.TipoMecanismoContactoResponse;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import uni.fiis.team.vizzlan.response.personas.MecanismoDeContactoResponse;
import uni.fiis.team.vizzlan.response.personas.TipoIdentificacionResponse;

public interface UsuarioDao {

    public void RegistrarTipoParte(PersonaRequest pr) throws SQLException;
    public void RegistrarDatosPersonales(Integer cod,PersonaRequest pr) throws SQLException;
    public void RegistroCuenta(UsuarioRequest ur) throws SQLException;
    public List<TipoMecanismoContactoResponse> mostrarTipoMecanismoContacto() throws SQLException;
    public void RegistrarContacto(MecanismoDeContactoRequest mcr) throws SQLException;
    public List<TipoIdentificacionResponse> mostrarTipoIdentificacion() throws SQLException;
    public void RegistroIdentificacion(IdentificacionRequest ir) throws Exception;
    
    public List<ParteResponse> selectParte() throws SQLException;
    public Integer obtenerKey() throws SQLException;
    public Integer buscarTipoMecanismoContacto(String descripcion) throws SQLException;
}
