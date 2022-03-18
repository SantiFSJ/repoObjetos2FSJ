package punto2;

public class Pago {
	protected TarjetaCredito tarjetaAsociada;
	protected float montoFinal;
	protected Pedido pedidoAsociado;
	protected float propina;

	public Pago(Pedido pedido, TarjetaCredito unaTarjeta, float propina) {
		this.pedidoAsociado = pedido;
		this.montoFinal = this.pedidoAsociado.getMontoTotal();
		this.propina = propina;
		this.montoFinal = aplicarDescuento();
		this.montoFinal = sumarPropina();
	}

	public float aplicarDescuento() {
		return this.tarjetaAsociada.calcularDescuento(this.pedidoAsociado);
	}

	public float sumarPropina() {
		return (this.montoFinal + (this.montoFinal / 100) * propina);// Contemplar Cambiarlo en un Futuro
	}

}
