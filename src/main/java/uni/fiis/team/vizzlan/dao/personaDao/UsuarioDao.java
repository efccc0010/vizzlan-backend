package uni.fiis.team.vizzlan.dao.personaDao;

import uni.fiis.team.vizzlan.domain.persona.ParteResponse;
import uni.fiis.team.vizzlan.response.pedido.PedidoResponse;

import java.sql.SQLException;
import java.util.List;

public interface UsuarioDao {

    public void RegistrarTipoParte(Integer idp, String tip) throws Exception;
    public void RegistrarDatosPersonales(PersonaRequest pr) throws Exception;
    public void RegistroCuenta(UsuarioRequest ur) throws Exception;
    public void RegistrarContacto(MecanismoDeContactoRequest mcr) throws Exception;
    public void RegistroIdentificacion(IdentificacionRequest ir) throws Exception;
    public List<ParteResponse> selectParte() throws SQLException;
}
