package punto2;

public class TarjetaComarcaPlus implements TarjetaCredito {
	private float descuentoTotal;

	public TarjetaComarcaPlus() {
		descuentoTotal = 2;
	}

	@Override
	public Double calcularDescuento(Pedido pedido) {
		Double montoFinal = pedido.getMontoTotal();
		montoFinal = montoFinal - ((pedido.getMontoTotal() / 100) * this.descuentoTotal);
		return montoFinal;
	}
}
