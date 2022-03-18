package punto2;

public class TarjetaVisa implements TarjetaCredito {
	private float descuentoBebidas;

	public TarjetaVisa() {
		descuentoBebidas = 3;
	}

	@Override
	public Double calcularDescuento(Pedido pedido) {
		Double montoFinal = pedido.getMontoTotal();
		montoFinal = montoFinal - ((pedido.getMontoTotalBebidas() / 100) * this.descuentoBebidas);
		return montoFinal;
	}

}
