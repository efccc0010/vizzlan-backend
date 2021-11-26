package uni.fiis.team.vizzlan.domain.pedido;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import uni.fiis.team.vizzlan.domain.persona.Usuario;

public class Pedido {
    private Integer codigo ;
    private Date fechaPedido;
    private String estadoPedido;
    private String descripcion;
    private String operador;
    private Usuario comprador;
    private Double montoTotal;
    private Envio envio;
    private CarritoDeCompra carroCompra;

    public Pedido(Integer codigo, Date fechaPedido, String estadoPedido, String descripcion, String operador, Usuario comprador, Envio envio, CarritoDeCompra carroCompra) {
        this.codigo = codigo;
        this.fechaPedido = fechaPedido;
        this.estadoPedido = estadoPedido;
        this.descripcion = descripcion;
        this.operador = operador;
        this.comprador = comprador;
        this.envio = envio;
        this.carroCompra = carroCompra;
    }

    public Pedido(Integer codigo, Date fechaPedido, String descripcion) {
        this.codigo = codigo;
        this.fechaPedido = fechaPedido;
        this.descripcion = descripcion;
    }
    
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public String getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public Usuario getComprador() {
        return comprador;
    }

    public void setComprador(Usuario comprador) {
        this.comprador = comprador;
    }

    public Double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(Double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public Envio getEnvio() {
        return envio;
    }

    public void setEnvio(Envio envio) {
        this.envio = envio;
    }

    public CarritoDeCompra getCarroCompra() {
        return carroCompra;
    }

    public void setCarroCompra(CarritoDeCompra carroCompra) {
        this.carroCompra = carroCompra;
    }
    
   
 
    

}
