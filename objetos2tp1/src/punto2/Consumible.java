package punto2;

public class Consumible {
	private String nombre;
	protected float precio;

	public Consumible(String nombre, float precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public float getPrecio() {
		return precio;
	}

}
