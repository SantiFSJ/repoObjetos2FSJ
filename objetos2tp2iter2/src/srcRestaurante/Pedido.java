package srcRestaurante;

import java.util.ArrayList;

public class Pedido {
	private ArrayList<Bebida> listaBebidas;
	private ArrayList<PlatoPrincipal> listaPlatos;
	private Estado estado;
	private Boolean pagado;

	public Pedido() {
		super();
		this.listaBebidas = new ArrayList<Bebida>();
		this.listaPlatos = new ArrayList<PlatoPrincipal>();
		this.estado = new Estado();
		this.pagado = false;
	}

	public void añadirBebida(Bebida bebida) {
		if (this.estado.pendiente()) {
			this.listaBebidas.add(bebida);
		} else {
			throw new RuntimeException("No se pudo añadir la Bebida");
		}

	}

	public void añadirPlato(PlatoPrincipal plato) {
		if (this.estado.pendiente()) {
			this.listaPlatos.add(plato);
		} else {
			throw new RuntimeException("No se puedo añadir el Plato");
		}

	}

	public void confirmarPedido() {
		this.estado.confirmar();
	}

	public Double montoTotal() {
		Double montoTotal = 0.0;
		for (Bebida b : listaBebidas) {
			montoTotal = montoTotal + b.precio();
		}
		for (PlatoPrincipal p : listaPlatos) {
			montoTotal = montoTotal + p.precio();
		}

		return montoTotal;
	}

	public Double montoTotalBebidas() {
		Double montoTotalBebidas = 0.0;
		for (Bebida b : listaBebidas) {
			montoTotalBebidas = montoTotalBebidas + b.precio();
		}
		return montoTotalBebidas;
	}

	public Double montoTotalPlatos() {
		Double montoTotalPlatos = 0.0;
		for (PlatoPrincipal p : listaPlatos) {
			montoTotalPlatos = montoTotalPlatos + p.precio();
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
