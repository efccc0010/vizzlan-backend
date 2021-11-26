package uni.fiis.team.vizzlan.domain.pago;

import java.util.Date;

public class Factura extends ComprobantePago{
    private Integer RUC;

    public Factura(Integer codComprobante, Date fechaEmisor, Integer codUsuarioEmisor, Float monto, String descripcion, Boolean estado, Integer RUC) {
        super(codComprobante, fechaEmisor, codUsuarioEmisor, monto, descripcion, estado);
        this.RUC = RUC;
    }

    public Integer getRUC() {
        return RUC;
    }

    public void setRUC(Integer RUC) {
        this.RUC = RUC;
    }
}
