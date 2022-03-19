package anemico;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class MainA {
	// ANEMICO

	public static void main(String[] args) throws ParseException {

		System.out.println("ANEMICO");

		LocalDate hoy = LocalDate.now();

		TiempoA fechaActual = new TiempoA(hoy.getDayOfMonth(), hoy.getMonthValue(), hoy.getYear());

		String mesText = null;
		switch (fechaActual.getMes()) {
		case 0: {
			mesText = "Enero";
			break;
		}
		case 1: {
			mesText = "Febrero";
			break;
		}
		case 2: {
			mesText = "Marzo";
			break;
		}
		case 3: {
			mesText = "Abril";
			break;
		}
		case 4: {
			mesText = "Mayo";
			break;
		}
		case 5: {
			mesText = "Junio";
			break;
		}
		case 6: {
			mesText = "Julio";
			break;
		}
		case 7: {
			mesText = "Agosto";
			break;
		}
		case 8: {
			mesText = "Septiembre";
			break;
		}
		case 9: {
			mesText = "Octubre";
			break;
		}
		case 10: {
			mesText = "Noviembre";
			break;
		}
		case 11: {
			mesText = "Diciembre";
			break;
		}
		}

		LocalDate fechaHoy = LocalDate.of(fechaActual.getAño(), fechaActual.getMes(), fechaActual.getDia());
		System.out.println("Formato Corto: " + fechaHoy.getDayOfMonth() + "/" + fechaHoy.getMonthValue() + "/"
				+ fechaHoy.getYear());

		DateTimeFormatter formatoDia = DateTimeFormatter.ofPattern("EEEE", new Locale("es", "ES"));
		DateTimeFormatter formatoMes = DateTimeFormatter.ofPattern("MMMM", new Locale("es", "ES"));
		System.out.println("Formato Largo: " + fechaHoy.format(formatoDia) + " " + fechaHoy.getDayOfMonth() + " de "
				+ fechaHoy.format(formatoMes) + " del " + fechaHoy.getYear());

	}
}
