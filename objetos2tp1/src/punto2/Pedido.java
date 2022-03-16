package punto2;

import java.util.ArrayList;

public class Pedido {
	private ArrayList<Item> itemsPedido;
	private Estado estado;

	public Pedido(ArrayList<Item> itemsPedido) {
		super();
		this.itemsPedido = itemsPedido;
		this.estado = new Estado();
	}

	public Pedido() {
		super();
		this.itemsPedido = new ArrayList<Item>();
		this.estado = new Estado();
	}

	public ArrayList<Item> getItemsPedido() {
		return itemsPedido;
	}

	public void setItemsPedido(ArrayList<Item> itemsPedido) {
		if (this.estado.pendiente()) {
			this.itemsPedido = itemsPedido;
		} else {
			System.out.println("No se puedo añadir el Item");
		}
	}

	public void añadirItemPedido(Item nuevoItem) {
		if (this.estado.pendiente() && !itemsPedido.contains(nuevoItem)) {
			this.itemsPedido.add(nuevoItem);
		} else {
			System.out.println("No se puedo añadir el Item");
		}

	}

	public void confirmarPedido() {
		this.estado.confirmar();
	}

	public Estado getEstado() {
		return this.estado;
	}

	public float getMontoTotal() {
		float montoTotal = 0;
		for (Item i : itemsPedido) {
			montoTotal = montoTotal + i.getCostoTotal();
		}
		return montoTotal;
	}

	public float getMontoTotalBebidas() {
		float montoTotalBebidas = 0;
		for (Item i : itemsPedido) {
			montoTotalBebidas = montoTotalBebidas + i.getCostoTotal();
			if (i.getConsumible() instanceof Bebida) {
				montoTotalBebidas = montoTotalBebidas + i.getCostoTotal();
			}
		}
		return montoTotalBebidas;
	}

	public float getMontoTotalPlatos() {
		float montoTotalPlatos = 0;
		for (Item i : itemsPedido) {
			montoTotalPlatos = montoTotalPlatos + i.getCostoTotal();
			if (i.getConsumible() instanceof PlatoPrincipal) {
				montoTotalPlatos = montoTotalPlatos + i.getCostoTotal();
			}
		}
		return montoTotalPlatos;
	}
}
