package uni.fiis.team.vizzlan.dao.productoDao;



import uni.fiis.team.vizzlan.domain.producto.*;

import java.sql.SQLException;
import java.util.List;


public interface ProductoDao {
    List<Producto> encontrarTodosProductos() throws SQLException;
    List<String> encontrarCategorias() throws SQLException;
    List<CategoriaProductosRequest> encontrarProductosPorCategorias() throws SQLException;
    List<CaracteristicasProductosRequest> obtenerTodasCaracteristicas() throws SQLException;
    List<CaracteristicaAplicadoProductoResponse> obtenerCaracteristicasProductos() throws SQLException;
}
