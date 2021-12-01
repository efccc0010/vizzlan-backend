package uni.fiis.team.vizzlan.domain.pedido;

public class DescuentoResponse {

    private Integer costo;
    private String tipoVenta;
    private Integer cantPedido;
    private String porcentaje;

    public DescuentoResponse(Integer costo, String tipoVenta, Integer cantPedido, String porcentaje) {
        this.costo = costo;
        this.tipoVenta = tipoVenta;
        this.cantPedido = cantPedido;
        this.porcentaje = porcentaje;
    }

    public Integer getCosto() {
        return costo;
    }

    public void setCosto(Integer costo) {
        this.costo = costo;
    }

    public String getTipoVenta() {
        return tipoVenta;
    }

    public void setTipoVenta(String tipoVenta) {
        this.tipoVenta = tipoVenta;
    }

    public Integer getCantPedido() {
        return cantPedido;
    }

    public void setCantPedido(Integer cantPedido) {
        this.cantPedido = cantPedido;
    }

    public String getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(String porcentaje) {
        this.porcentaje = porcentaje;
    }
}
