package punto2;

public class PagoMastercard extends Pago {

	private float descuentoPlato;

	public PagoMastercard(String dni, Pedido pedido) {
		super(dni, pedido);
		// TODO Auto-generated constructor stub
		this.descuentoPlato = 2;
	}

	public void calcularMontoFinal() {
		montoFinal = montoFinal - ((this.pedido.getMontoTotalPlatos() / 100) * this.descuentoPlato);
	}

	public float getDescuentoPlato() {
		return descuentoPlato;
	}

}
