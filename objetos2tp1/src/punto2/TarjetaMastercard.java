package punto2;

public class TarjetaMastercard implements TarjetaCredito {
	private float descuentoPlato;

	public TarjetaMastercard() {
		descuentoPlato = 2;
	}

	@Override
	public Double calcularDescuento(Pedido pedido) {
		Double montoFinal = pedido.getMontoTotal();
		montoFinal = montoFinal - ((pedido.getMontoTotalPlatos() / 100) * this.descuentoPlato);
		return montoFinal;
	}

}
