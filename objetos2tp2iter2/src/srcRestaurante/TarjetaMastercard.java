package srcRestaurante;

public class TarjetaMastercard implements TarjetaCredito {
	private float descuentoPlato;

	public TarjetaMastercard(int descuento) {
		descuentoPlato = descuento;
	}

	@Override
	public Double calcularDescuento(Pedido pedido) {
		Double montoFinal = pedido.montoTotal();
		montoFinal = montoFinal - ((pedido.montoTotalPlatos() / 100) * this.descuentoPlato);
		return montoFinal;
	}

}
