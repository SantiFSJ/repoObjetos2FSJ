package srcRestaurante;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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

	public void archivar(File file) {

		LocalDate fechaActual = LocalDate.now();

		try {
			FileWriter myWriter = new FileWriter(file, true);
			myWriter.write(fechaActual.getDayOfMonth() + "/" + fechaActual.getMonthValue() + "/" + fechaActual.getYear()
					+ " || " + this.montoFinal + "\n");
			myWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public Double aplicarDescuento() {
		return this.tarjetaAsociada.calcularDescuento(this.pedidoAsociado);
	}

	public Double sumarPropina() {
		return (this.montoFinal + (this.montoFinal / 100) * propina);// Contemplar Cambiarlo en un Futuro
	}

	public Double montoFinal() {
		return montoFinal;
	}

}
