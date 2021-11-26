package uni.fiis.team.vizzlan.domain.pago;

import java.util.Date;

public class Boleta extends ComprobantePago{
    private Float IGV;

    public Boleta(Integer codComprobante, Date fechaEmisor, Integer codUsuarioEmisor, Float monto, String descripcion, Boolean estado, Float IGV) {
        super(codComprobante, fechaEmisor, codUsuarioEmisor, monto, descripcion, estado);
        this.IGV = IGV;
    }

    public Float getIGV() {
        return IGV;
    }

    public void setIGV(Float IGV) {
        this.IGV = IGV;
    }
}
