package srcEjercicio1;

import java.util.ArrayList;

public class Alquileres {
	public ArrayList<Alquiler> alquileres;

	public Alquileres() {
		alquileres = new ArrayList<Alquiler>();
	}

	public void a�adir(Alquiler alquiler) {
		alquileres.add(alquiler);
	}

	public ArrayList<Alquiler> alquileres() {
		return alquileres;
	}
}
