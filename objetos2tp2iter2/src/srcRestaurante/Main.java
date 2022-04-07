package srcRestaurante;

import persistenciaRestaurante.EnBaseDeDatosRegistroPagoRestaurante;
import persistenciaRestaurante.EnDiscoRegistroPagoRestaurante;

public class Main {
	public static void main(String[] args) {
		// Para guardar tanto en Disco y en Base
		PlatoPrincipal p1 = new PlatoPrincipal("Pizza", 500);
		PlatoPrincipal p2 = new PlatoPrincipal("Lasagna", 600);

		Bebida b1 = new Bebida("Agua", 50);

		Pedido pedido = new Pedido();

		pedido.a�adirPlato(p1);
		pedido.a�adirPlato(p1);
		pedido.a�adirPlato(p2);
		pedido.a�adirBebida(b1);
		pedido.a�adirBebida(b1);
		pedido.a�adirBebida(b1);

		pedido.confirmarPedido();

		TarjetaVisa tarjetaVisa = new TarjetaVisa(3);

		Pago pago = pedido.pagar(tarjetaVisa, 2);

		EnBaseDeDatosRegistroPagoRestaurante registroEnBase = new EnBaseDeDatosRegistroPagoRestaurante();

		EnDiscoRegistroPagoRestaurante registroEnDisco = new EnDiscoRegistroPagoRestaurante();

		pago.archivar(registroEnBase);

		pago.archivar(registroEnDisco);

	}

}
