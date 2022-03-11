package anemico;

public class Main {
	// ANEMICO
	public static void main(String[] args) {
		Tiempo fechaActual = new Tiempo(11, 3, 2022);
		System.out.println(
				"Formato Corto: " + fechaActual.getDia() + "/" + fechaActual.getMes() + "/" + fechaActual.getAño());

		System.out.println("Formato Largo: " + fechaActual.getDia() + " de " + "Mes" + " de " + fechaActual.getAño());

	}
}
