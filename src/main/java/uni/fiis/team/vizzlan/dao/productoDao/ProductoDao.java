package uni.fiis.team.vizzlan.dao.productoDao;



import org.springframework.data.jpa.repository.Query;
import uni.fiis.team.vizzlan.domain.producto.*;

import java.sql.SQLException;
import java.util.List;


public interface ProductoDao {
    List<Producto> encontrarTodosProductos() throws SQLException;
    List<String> encontrarCategorias() throws SQLException;
    List<CategoriaProductosRequest> encontrarProductosPorCategorias() throws SQLException;
    List<CaracteristicasProductosRequest> obtenerTodasCaracteristicas() throws SQLException;
    List<CaracteristicaAplicadoProductoResponse> obtenerCaracteristicasProductos() throws SQLException;
    List<CategoriaProductoResponse> obtenerTodasCategorias() throws SQLException;
    List<CategoriaProductosRequest> filtrarProductoPorCategoria(Integer idCategoria) throws Exception;
    //List<CategoriaProductosRequest> filtrarProductoPorTalla() throws SQLException;
    //List<CategoriaProductosRequest> filtrarProductoPorPrecio() throws SQLException;
    //List<CategoriaProductosRequest> filtrarProductoPorCategoria() throws SQLException;
    //List<CategoriaProductosRequest> filtrarProductoPorModelo() throws SQLException;
}
