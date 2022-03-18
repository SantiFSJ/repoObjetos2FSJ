package punto2;

public class TarjetaMastercard {
	private float descuentoPlato;

	public TarjetaMastercard() {
		descuentoPlato = 2;
	}

	public float calcularDescuento(Pedido pedido) {
		float montoFinal = pedido.getMontoTotal();
		montoFinal = montoFinal - ((pedido.getMontoTotalPlatos() / 100) * this.descuentoPlato);
		return montoFinal;
	}

}
