package anemico;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
	// ANEMICO
	public static void main(String[] args) {
		System.out.println("ANEMICO");
		Date hoy = Calendar.getInstance().getTime();
		Calendar c = Calendar.getInstance();
		c.setTime(hoy);
		Tiempo fechaActual = new Tiempo(c.get(Calendar.DAY_OF_MONTH), c.get(Calendar.MONTH), c.get(Calendar.YEAR));
		System.out.println("Formato Corto: " + fechaActual.getDia() + "/" + (fechaActual.getMes() + 1) + "/"
				+ fechaActual.getAño());

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

		String diaTexto = new SimpleDateFormat("EEEE").format(hoy);

		System.out.println("Formato Largo: " + diaTexto + " " + fechaActual.getDia() + " de " + mesText + " de "
				+ fechaActual.getAño());

	}
}
