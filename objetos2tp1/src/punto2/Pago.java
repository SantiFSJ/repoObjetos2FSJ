package punto2;

public class Pago {
	protected TarjetaCredito tarjetaAsociada;
	protected Double montoFinal;
	protected Pedido pedidoAsociado;
	protected float propina;

	public Pago(Pedido pedido, TarjetaCredito unaTarjeta, float propina) {
		this.pedidoAsociado = pedido;
		this.montoFinal = this.pedidoAsociado.getMontoTotal();
		this.propina = propina;
		this.tarjetaAsociada = unaTarjeta;
		this.montoFinal = aplicarDescuento();
		this.montoFinal = sumarPropina();
	}

	public Double aplicarDescuento() {
		return this.tarjetaAsociada.calcularDescuento(this.pedidoAsociado);
	}

	public Double sumarPropina() {
		return (this.montoFinal + (this.montoFinal / 100) * propina);// Contemplar Cambiarlo en un Futuro
	}

	public Double getMontoFinal() {
		return montoFinal;
	}

}
