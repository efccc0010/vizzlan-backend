package uni.fiis.team.vizzlan.service.productoService;

import org.springframework.stereotype.Service;
import uni.fiis.team.vizzlan.domain.producto.CaracteristicaAplicadoProductoResponse;
import uni.fiis.team.vizzlan.domain.producto.CategoriaProductosRequest;
import uni.fiis.team.vizzlan.domain.producto.Producto;

import java.sql.SQLException;
import java.util.List;

@Service
public interface ProductoService {
    List<Producto> encontrarTodosProductos() throws SQLException;
    List<String> listaCategoriasProductos() throws  SQLException;
    List<CategoriaProductosRequest> encontrarProductosPorCategorias() throws SQLException;
    List<CaracteristicaAplicadoProductoResponse> encontrarCaracteristicasProductos() throws SQLException;
}
