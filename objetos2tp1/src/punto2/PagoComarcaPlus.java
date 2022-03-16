package punto2;

public class PagoComarcaPlus extends Pago {

	private float descuentoTotal;

	public PagoComarcaPlus(String dni, Pedido pedido) {
		super(dni, pedido);
		// TODO Auto-generated constructor stub
		this.descuentoTotal = 2;
	}

	public void calcularMontoFinal() {
		montoFinal = montoFinal - ((montoFinal / 100) * this.descuentoTotal);
	}

	public float getDescuentoTotal() {
		return descuentoTotal;
	}

}
