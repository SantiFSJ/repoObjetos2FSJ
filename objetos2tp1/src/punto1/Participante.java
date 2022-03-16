package punto1;

public class Participante {

	int puntos;
	String dni;
	String nombre;
	String apellido;

	public Participante(String dni, String nombre, String apellido) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.puntos = 0;
	}

	public void sumarPuntos(int puntosASumar) {
		this.puntos = this.puntos + puntosASumar;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "DNI: " + this.dni + " PUNTAJE: " + this.puntos;
	}
}
