package uni.fiis.team.vizzlan.domain.pedido;

import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import uni.fiis.team.vizzlan.domain.persona.Usuario;

public class Pedido {
    private Integer codigo ;
    private Date fechaPedido;
    private String tipo;
    private String descripcion;
    private String estadoPedido;
    private Usuario comprador;
    private String operador;
    private Double montoTotal;
    private Envio envio;
    private CarritoDeCompra carroCompra;

    public Pedido(Integer codigo, java.sql.Date fechaPedido,String tipo, String estadoPedido, String descripcion, String operador, Usuario comprador, Envio envio, CarritoDeCompra carroCompra) {
        this.codigo = codigo;
        this.fechaPedido = fechaPedido;
        this.tipo=tipo;
        this.estadoPedido = estadoPedido;
        this.descripcion = descripcion;
        this.operador = operador;
        this.comprador = comprador;
        this.envio = envio;
        this.carroCompra = carroCompra;
    }

    public Pedido(Integer codigo, java.sql.Date fechaPedido, String tipo, String descripcion, String estadoPedido) {
        this.codigo = codigo;
        this.fechaPedido = fechaPedido;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.estadoPedido = estadoPedido;
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

    public void setFechaPedido(java.sql.Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
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
