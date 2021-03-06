package uni.fiis.team.vizzlan.dao.productoDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import uni.fiis.team.vizzlan.domain.producto.*;
import uni.fiis.team.vizzlan.request.producto.CaracteristicasProductosRequest;
import uni.fiis.team.vizzlan.request.producto.CategoriaProductosRequest;
import uni.fiis.team.vizzlan.response.producto.CaracteristicaAplicadoProductoResponse;
import uni.fiis.team.vizzlan.response.producto.CategoriaProductoResponse;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductoDaoImpl implements ProductoDao{
    @Autowired
    private JdbcTemplate template;
    private Object CaracteristicasProductosRequest;

    @Override
    public List<Producto> encontrarTodosProductos() throws SQLException {
        List<Producto> listaProductos = new ArrayList<>();
        Connection conn = template.getDataSource().getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT idProducto, descripcion, fechaInscripcion FROM Producto");
        while(rs.next()){
            Producto prod =new Producto(rs.getInt(1), rs.getString(2), rs.getDate(3));
            listaProductos.add(prod);
        }
        rs.close();
        st.close();
        conn.close();
        return listaProductos;
    }

    @Override
    public List<String> encontrarCategorias() throws SQLException {
        List<String> listaCategorias = new ArrayList<>();
        Connection conn = template.getDataSource().getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(
                "SELECT CategoriaProductos.descripcion" +
                " FROM (Producto)" +
                " JOIN (ClasificacionCategoriaProductos)" +
                " JOIN (CategoriaProductos)" +
                " WHERE((Producto.idProducto = ClasificacionCategoriaProductos.idProducto) AND (ClasificacionCategoriaProductos.idCategoriaProductos = CategoriaProductos.idCategoriaProductos))"
        );
        while(rs.next()){
            String cat = new String(rs.getString(1));
            listaCategorias.add(cat);
        }
        rs.close();
        st.close();
        conn.close();
        return listaCategorias;
    }

    @Override
    public List<CategoriaProductosRequest> encontrarProductosPorCategorias() throws SQLException {
        List<CategoriaProductosRequest> listaCategoriaProductos = new ArrayList<>();
        Connection conn = template.getDataSource().getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select p.idProducto, p.descripcion, ccp.idCategoriaProductos, cp.descripcion\n" +
                "from producto p\n" +
                "join clasificacioncategoriaproductos ccp\n" +
                "join categoriaproductos cp\n" +
                "where(\n" +
                "\tp.idProducto = ccp.idProducto and\n" +
                "    cp.idCategoriaProductos = ccp.idCategoriaProductos\n" +
                ")\n" +
                "order by p.idProducto;");
        while(rs.next()){
            CategoriaProductosRequest categoriaProductosRequest =new CategoriaProductosRequest(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4));
            listaCategoriaProductos.add(categoriaProductosRequest);
        }
        rs.close();
        st.close();
        conn.close();
        return listaCategoriaProductos;
    }

    @Override
    public List<CaracteristicasProductosRequest> obtenerTodasCaracteristicas() throws SQLException {
        List<CaracteristicasProductosRequest> listaCaracteristicaProductos = new ArrayList<>();
        Connection conn = template.getDataSource().getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from caracteristicasproductos");
        while(rs.next()){
            CaracteristicasProductosRequest caracteristicasProductosRequest = new CaracteristicasProductosRequest(rs.getInt(1),rs.getString(2),rs.getString(3));
            listaCaracteristicaProductos.add(caracteristicasProductosRequest);
        }
        rs.close();
        st.close();
        conn.close();
        return listaCaracteristicaProductos;
    }

    @Override
    public List<CaracteristicaAplicadoProductoResponse> obtenerCaracteristicasProductos() throws SQLException {
        List<CaracteristicaAplicadoProductoResponse> listaCaracteristicasAplicados = new ArrayList<>();
        Connection conn = template.getDataSource().getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select p.idProducto, p.descripcion, p.fechaInscripcion, p.fechaCaducacion,\n" +
                "cp.idTipoCaracteristicasProducto, cp.descripcion, cp.tipoCaracteristica\n" +
                "from producto p\n" +
                "join caracteristicaproductoaplicado cpa\n" +
                "join caracteristicasproductos cp\n" +
                "where (\n" +
                "\tp.idProducto = cpa.idProducto and\n" +
                "\tcp.idTipoCaracteristicasProducto = cpa.idTipoCaracteristicasProducto\n" +
                ");");
        while(rs.next()){
            CaracteristicaAplicadoProductoResponse caracteristicaAplicadoProductoResponse = new CaracteristicaAplicadoProductoResponse(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getDate(3),
                    rs.getDate(4),
                    rs.getInt(5),
                    rs.getString(6),
                    rs.getString(7)
            );
            listaCaracteristicasAplicados.add(caracteristicaAplicadoProductoResponse);
        }
        rs.close();
        st.close();
        conn.close();
        return listaCaracteristicasAplicados;
    }

    @Override
    public List<CategoriaProductoResponse> obtenerTodasCategorias() throws SQLException {
        List<CategoriaProductoResponse> listaCategorias = new ArrayList<>();
        Connection conn = template.getDataSource().getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from categoriaproductos");
        while(rs.next()){
            CategoriaProductoResponse categoriaProductoResponse = new CategoriaProductoResponse(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getInt(3)
            );
            listaCategorias.add(categoriaProductoResponse);
        }
        rs.close();
        st.close();
        conn.close();
        return listaCategorias;
    }

    @Override
    public List<CategoriaProductosRequest> filtrarProductoPorCategoria(Integer idCategoria) throws Exception {
        List<CategoriaProductosRequest> listaProductosFiltrados = new ArrayList<>();
        Connection conn = template.getDataSource().getConnection();
        String sql = "select p.idProducto,\n" +
                "p.descripcion,\n" +
                "cp.idCategoriaProductos,\n" +
                "cp.descripcion\n" +
                "from producto p\n" +
                "join categoriaproductos cp\n" +
                "join clasificacioncategoriaproductos ccp\n" +
                "where (\n" +
                "\tp.idProducto like ccp.idProducto and\n" +
                "    cp.idCategoriaProductos like ccp.idCategoriaProductos and\n" +
                "    ccp.idCategoriaProductos like ?\n" +
                ")";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setInt(1,idCategoria);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            CategoriaProductosRequest categoriaProductosRequest = new CategoriaProductosRequest(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getInt(3),
                    rs.getString(4)
            );
            listaProductosFiltrados.add(categoriaProductosRequest);
        }
        rs.close();
        pst.close();
        conn.close();
        return listaProductosFiltrados;
    }

}
