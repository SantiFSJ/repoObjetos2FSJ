package srcEjercicio1;

public class Main {
	public static void main(String args[]) {
		Libro elTunel = new Libro("El Túnel");
		Libro antesDelFin = new Libro("Antes del Fin");
		CopiaLibro elTunelCopia = new CopiaLibro(elTunel);
		CopiaLibro antesDelFinCopia = new CopiaLibro(antesDelFin);

		Cliente yo = new Cliente("Javier");
		yo.alquilar(elTunelCopia, 5);
		yo.alquilar(antesDelFinCopia, 3);
		double resultado = yo.obtenerDeuda();
		int puntaje = yo.obtenerPuntosObtenidos();

		System.out.println(resultado);
		System.out.println(puntaje);
	}
}