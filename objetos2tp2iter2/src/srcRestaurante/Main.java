package srcRestaurante;

import persistenciaRestaurante.EnBaseDeDatosRegistroPagoRestaurante;
import persistenciaRestaurante.EnDiscoRegistroPagoRestaurante;

public class Main {
	public static void main(String[] args) {
		// Para guardar tanto en Disco y en Base
		PlatoPrincipal p1 = new PlatoPrincipal("Pizza", 500);
		PlatoPrincipal p2 = new PlatoPrincipal("Lasagna", 600);

		Bebida b1 = new Bebida("Agua", 50);

		EnBaseDeDatosRegistroPagoRestaurante registroEnBase = new EnBaseDeDatosRegistroPagoRestaurante();

		Pedido pedido = new Pedido(registroEnBase);

		pedido.añadirPlato(p1);
		pedido.añadirPlato(p1);
		pedido.añadirPlato(p2);
		pedido.añadirBebida(b1);
		pedido.añadirBebida(b1);
		pedido.añadirBebida(b1);

		pedido.confirmarPedido();

		TarjetaVisa tarjetaVisa = new TarjetaVisa(3);

		Pago pago = pedido.pagar(tarjetaVisa, 2);

		EnDiscoRegistroPagoRestaurante registroEnDisco = new EnDiscoRegistroPagoRestaurante();

		Pedido pedido2 = new Pedido(registroEnBase);

		pedido2.añadirPlato(p1);
		pedido2.añadirPlato(p1);
		pedido2.añadirPlato(p2);
		pedido2.añadirBebida(b1);
		pedido2.añadirBebida(b1);
		pedido2.añadirBebida(b1);

		pedido2.confirmarPedido();

		Pago pago2 = pedido.pagar(tarjetaVisa, 2);

	}

}
