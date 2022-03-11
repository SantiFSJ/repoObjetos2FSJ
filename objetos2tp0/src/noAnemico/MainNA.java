package noAnemico;

import java.util.Calendar;
import java.util.Date;

public class MainNA {
	// NO ANEMICO
	public static void main(String[] args) {
		System.out.println("NO ANEMICO");
		Date date = Calendar.getInstance().getTime();
		TiempoNA fechaActual = new TiempoNA(date);
		fechaActual.imprimirEnFormatoCorto();
		fechaActual.imprimirEnFormatoLargo();
	}
}
