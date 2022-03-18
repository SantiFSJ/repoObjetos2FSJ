package punto2;

public class TarjetaVisa {
	private float descuentoBebidas;

	public TarjetaVisa() {
		descuentoBebidas = 3;
	}

	public float calcularDescuento(Pedido pedido) {
		float montoFinal = pedido.getMontoTotal();
		montoFinal = montoFinal - ((pedido.getMontoTotalBebidas() / 100) * this.descuentoBebidas);
		return montoFinal;
	}

}
