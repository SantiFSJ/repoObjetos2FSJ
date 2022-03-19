package noAnemico;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TiempoNA {
	// NO ANEMICO
	// Este Objeto NO es Anemico, ya que no solo contiene datos, sino que tambien
	// guarda bastante logica derivada de los datos almacenados
	private LocalDate fechaHoy;

	public TiempoNA(LocalDate fechaHoy) {
		this.fechaHoy = fechaHoy;
	}

	public String imprimirEnFormatoCorto() {
		return (fechaHoy.getDayOfMonth() + "/" + fechaHoy.getMonthValue() + "/" + fechaHoy.getYear());
	}

	public String imprimirEnFormatoLargo() {
		DateTimeFormatter formatoDia = DateTimeFormatter.ofPattern("EEEE", new Locale("es", "ES"));
		DateTimeFormatter formatoMes = DateTimeFormatter.ofPattern("MMMM", new Locale("es", "ES"));
		return (fechaHoy.format(formatoDia) + " " + fechaHoy.getDayOfMonth() + " de " + fechaHoy.format(formatoMes)
				+ " del " + fechaHoy.getYear());
	}

}
