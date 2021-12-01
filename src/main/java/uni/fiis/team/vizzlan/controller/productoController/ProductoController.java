package uni.fiis.team.vizzlan.controller.productoController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uni.fiis.team.vizzlan.domain.producto.CaracteristicaAplicadoProductoResponse;
import uni.fiis.team.vizzlan.domain.producto.CategoriaProductoResponse;
import uni.fiis.team.vizzlan.domain.producto.CategoriaProductosRequest;
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

    @GetMapping("/productos/filtro/categoria")
    public List<CategoriaProductosRequest> filtroProductos() throws SQLException{
        return productoService.encontrarProductosPorCategorias();
    }

    @GetMapping("/productos/caracteristicas")
    public List<CaracteristicaAplicadoProductoResponse> caracteristicasProductos() throws SQLException{
        return productoService.encontrarCaracteristicasProductos();
    }

    @GetMapping("/categorias")
    public List<CategoriaProductoResponse> categorias() throws SQLException{
        return productoService.encontrarCategorias();
    }

    @GetMapping(value = "/productos/filtro/{idCategoria}", produces = {"application/json"})
    public @ResponseBody List<CategoriaProductosRequest> filtrar(@PathVariable Integer idCategoria) throws Exception{
        return productoService.filtrarProductos(idCategoria);
    }
}
