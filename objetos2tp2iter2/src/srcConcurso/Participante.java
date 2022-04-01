package srcConcurso;

public class Participante {

	private int puntos;
	private String dni;
	private String nombre;
	private String apellido;

	public Participante(String dni, String nombre, String apellido) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.puntos = 0;
	}

	public void sumarPuntos(int puntosASumar) {
		this.puntos = this.puntos + puntosASumar;
	}

	@Override
	public String toString() {
		return "Nombre y Apellido: " + this.nombre + " " + this.apellido + " DNI: " + this.dni + " PUNTAJE: "
				+ this.puntos;
	}

	public String dni() {
		return dni;
	}

	public int puntos() {
		return puntos;
	}
}
