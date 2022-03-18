package punto2;

public class Item {
	private Consumible consumible;
	private int cantidad;
	private float precio;

	public Item(Consumible consumible, int cantidad, float precio) {
		super();
		this.consumible = consumible;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public Consumible getConsumible() {
		return consumible;
	}

	public int getCantidad() {
		return cantidad;
	}

	public float getPrecio() {
		return precio;
	}

	public float getCostoTotal() {
		return (precio * cantidad);
	}

}
