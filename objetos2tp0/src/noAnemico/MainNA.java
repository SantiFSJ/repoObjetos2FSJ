package noAnemico;

import java.time.LocalDate;

public class MainNA {
	// NO ANEMICO
	public static void main(String[] args) {
		System.out.println("NO ANEMICO");
		LocalDate date = LocalDate.now();
		TiempoNA fechaActual = new TiempoNA(date);
		System.out.println("Formato Corto: " + fechaActual.imprimirEnFormatoCorto());
		System.out.println("Formato Largo: " + fechaActual.imprimirEnFormatoLargo());
	}
}
