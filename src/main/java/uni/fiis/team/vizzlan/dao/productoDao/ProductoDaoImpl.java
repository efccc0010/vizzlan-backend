package uni.fiis.team.vizzlan.dao.productoDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import uni.fiis.team.vizzlan.domain.producto.Producto;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductoDaoImpl implements ProductoDao{
    @Autowired
    private JdbcTemplate template;

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

}
