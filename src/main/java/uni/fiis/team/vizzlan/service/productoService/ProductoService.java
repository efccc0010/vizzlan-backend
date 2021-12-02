package uni.fiis.team.vizzlan.service.productoService;

import org.springframework.stereotype.Service;

import uni.fiis.team.vizzlan.domain.producto.Producto;
import uni.fiis.team.vizzlan.request.producto.CategoriaProductosRequest;
import uni.fiis.team.vizzlan.response.producto.CaracteristicaAplicadoProductoResponse;
import uni.fiis.team.vizzlan.response.producto.CategoriaProductoResponse;

import java.sql.SQLException;
import java.util.List;

@Service
public interface ProductoService {
    List<Producto> encontrarTodosProductos() throws SQLException;
    List<String> listaCategoriasProductos() throws  SQLException;
    List<CategoriaProductosRequest> encontrarProductosPorCategorias() throws SQLException;
    List<CaracteristicaAplicadoProductoResponse> encontrarCaracteristicasProductos() throws SQLException;
    List<CategoriaProductoResponse> encontrarCategorias() throws SQLException;
    List<CategoriaProductosRequest> filtrarProductos(Integer idCategoria) throws Exception;
}
