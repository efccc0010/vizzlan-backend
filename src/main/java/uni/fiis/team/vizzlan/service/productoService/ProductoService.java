package uni.fiis.team.vizzlan.service.productoService;

public class ProductoService {
    private static Integer id = 0;
    public ProductoService(){
        this.id +=1;
    }
    public Integer getId(){
        return this.id;
    }
}
