package punto2;

public class TarjetaComarcaPlus {
	private float descuentoTotal;

	public TarjetaComarcaPlus() {
		descuentoTotal = 2;
	}

	public float calcularDescuento(Pedido pedido) {
		float montoFinal = pedido.getMontoTotal();
		montoFinal = montoFinal - ((pedido.getMontoTotal() / 100) * this.descuentoTotal);
		return montoFinal;
	}
}
