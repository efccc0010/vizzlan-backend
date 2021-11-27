package uni.fiis.team.vizzlan.service.productoService;

import uni.fiis.team.vizzlan.domain.producto.Almacen;
import uni.fiis.team.vizzlan.domain.producto.Producto;


import java.util.List;

public interface AlmacenService {
    List <Almacen> encontrarTodoAlmacen();
    void eliminarProductoAlmacen(Producto productoAlmacen, Almacen almacen);
    Almacen guardarAlmacen(Almacen almacen);
    Producto encontrarProductoAlmacen (Integer codigoProducto, Integer codigoAlmacen);
}
