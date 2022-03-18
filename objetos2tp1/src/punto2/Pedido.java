package punto2;

import java.util.ArrayList;

public class Pedido {
	private ArrayList<Item> itemsPedido;
	private Estado estado;
	private Boolean pagado;

	public Pedido(ArrayList<Item> itemsPedido) {
		super();
		this.itemsPedido = itemsPedido;
		this.estado = new Estado();
		this.pagado = false;
	}

	public Pedido() {
		super();
		this.itemsPedido = new ArrayList<Item>();
		this.estado = new Estado();
		this.pagado = false;
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

	public Double getMontoTotal() {
		Double montoTotal = 0.0;
		for (Item i : itemsPedido) {
			montoTotal = montoTotal + i.getCostoTotal();
		}
		return montoTotal;
	}

	public Double getMontoTotalBebidas() {
		Double montoTotalBebidas = 0.0;
		for (Item i : itemsPedido) {
			if (i.getConsumible() instanceof Bebida) {
				montoTotalBebidas = montoTotalBebidas + i.getCostoTotal();
			}
		}
		return montoTotalBebidas;
	}

	public Double getMontoTotalPlatos() {
		Double montoTotalPlatos = 0.0;
		for (Item i : itemsPedido) {
			if (i.getConsumible() instanceof PlatoPrincipal) {
				montoTotalPlatos = montoTotalPlatos + i.getCostoTotal();
			}
		}
		return montoTotalPlatos;
	}

	public Pago pagar(TarjetaCredito unaTarjeta, float propina) {
		Pago pago = null;
		if (this.estado.confirmado() && this.pagado == false) {
			pago = new Pago(this, unaTarjeta, propina);
		}
		return pago;
	}
}
