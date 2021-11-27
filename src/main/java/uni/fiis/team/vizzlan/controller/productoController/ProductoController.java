package uni.fiis.team.vizzlan.controller.productoController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import uni.fiis.team.vizzlan.domain.producto.Producto;
import uni.fiis.team.vizzlan.service.productoService.ProductoService;

import java.sql.SQLException;
import java.util.List;


@RestController
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @GetMapping("/productos/lista")
    public List<Producto> listar() throws SQLException {
        return productoService.encontrarTodosProductos();
    }

    @GetMapping("/productos/categorias")
    public List<String> listarCategoria() throws SQLException{
        return  productoService.listaCategoriasProductos();
    }
}
