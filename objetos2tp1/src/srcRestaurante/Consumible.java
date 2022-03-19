package srcRestaurante;

public class Consumible {
	private String nombre;
	protected float precio;

	public Consumible(String nombre, float precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public String nombre() {
		return nombre;
	}

	public float precio() {
		return precio;
	}

}
