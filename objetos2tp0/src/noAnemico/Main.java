package noAnemico;

import java.util.Calendar;
import java.util.Date;

public class Main {
	// NO ANEMICO
	public static void main(String[] args) {
		Date date = Calendar.getInstance().getTime();
		Tiempo fechaActual = new Tiempo(date);
		fechaActual.imprimirEnFormatoCorto();
		fechaActual.imprimirEnFormatoLargo();
	}
}
