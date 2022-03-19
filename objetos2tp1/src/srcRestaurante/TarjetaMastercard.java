package srcRestaurante;

public class TarjetaMastercard implements TarjetaCredito {
	private float descuentoPlato;

	public TarjetaMastercard() {
		descuentoPlato = 2;
	}

	@Override
	public Double calcularDescuento(Pedido pedido) {
		Double montoFinal = pedido.montoTotal();
		montoFinal = montoFinal - ((pedido.montoTotalPlatos() / 100) * this.descuentoPlato);
		return montoFinal;
	}

}
