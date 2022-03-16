package punto2;

public class PagoVisa extends Pago {

	private float descuentoBebidas;

	public PagoVisa(String dni, Pedido pedido) {
		super(dni, pedido);
		// TODO Auto-generated constructor stub
		this.descuentoBebidas = 3;
	}

	public void calcularMontoFinal() {
		;
		montoFinal = montoFinal - ((this.pedido.getMontoTotalBebidas() / 100) * this.descuentoBebidas);
	}

	public float getDescuentoBebidas() {
		return descuentoBebidas;
	}

}
