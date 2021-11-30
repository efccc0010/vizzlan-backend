package uni.fiis.team.vizzlan.dao.productoDao;



import uni.fiis.team.vizzlan.domain.producto.Producto;

import java.sql.SQLException;
import java.util.List;


public interface ProductoDao {
    List<Producto> encontrarTodosProductos() throws SQLException;
    List<String> encontrarCategorias() throws SQLException;
}
