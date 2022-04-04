package srcRestaurante;

import java.io.File;
import java.time.LocalDate;

public class Pago {
	protected TarjetaCredito tarjetaAsociada;
	protected Double montoFinal;
	protected Pedido pedidoAsociado;
	protected float propina;

	public Pago(Pedido pedido, TarjetaCredito unaTarjeta, float propina) {
		this.pedidoAsociado = pedido;
		this.montoFinal = this.pedidoAsociado.montoTotal();
		this.propina = propina;
		this.tarjetaAsociada = unaTarjeta;
		this.montoFinal = aplicarDescuento();
		this.montoFinal = sumarPropina();
	}

	public void archivar(File file, RegistroDePago registro) {

		LocalDate fechaActual = LocalDate.now();

		String fechaYPago = fechaActual.getDayOfMonth() + "/" + fechaActual.getMonthValue() + "/"
				+ fechaActual.getYear() + " || " + this.montoFinal + "\n";

		registro.archivar(fechaYPago);
	}

	public Double aplicarDescuento() {
		return this.tarjetaAsociada.calcularDescuento(this.pedidoAsociado);
	}

	public Double sumarPropina() {
		return (this.montoFinal + (this.montoFinal / 100) * propina);
	}

	public Double montoFinal() {
		return montoFinal;
	}

}
