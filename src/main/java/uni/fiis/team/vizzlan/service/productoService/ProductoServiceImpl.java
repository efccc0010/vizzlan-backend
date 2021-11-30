package uni.fiis.team.vizzlan.service.productoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uni.fiis.team.vizzlan.dao.productoDao.ProductoDao;
import uni.fiis.team.vizzlan.domain.producto.Producto;

import java.sql.SQLException;
import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService{

    @Autowired
    private ProductoDao productoDao;

    @Override
    public List<Producto> encontrarTodosProductos() throws SQLException {
        return productoDao.encontrarTodosProductos();
    }

    @Override
    public List<String> listaCategoriasProductos() throws SQLException {
        return productoDao.encontrarCategorias();
    }
}
