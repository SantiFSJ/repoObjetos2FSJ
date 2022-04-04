package srcRestaurante;

public class TarjetaComarcaPlus implements TarjetaCredito {
	private float descuentoTotal;

	public TarjetaComarcaPlus(int descuento) {
		descuentoTotal = descuento;
	}

	@Override
	public Double calcularDescuento(Pedido pedido) {
		Double montoFinal = pedido.montoTotal();
		montoFinal = montoFinal - ((pedido.montoTotal() / 100) * this.descuentoTotal);
		return montoFinal;
	}
}
