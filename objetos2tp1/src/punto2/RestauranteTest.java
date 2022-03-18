package punto2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RestauranteTest {
	@Test
	public void pagoTarjetaVisa() {
		// Set up
		PlatoPrincipal p1 = new PlatoPrincipal("Pizza", 500);
		PlatoPrincipal p2 = new PlatoPrincipal("Lasagna", 600);

		Bebida b1 = new Bebida("Agua", 50);

		Menu menu = new Menu();

		menu.a�adirConsumible(p2);
		menu.a�adirConsumible(p1);

		menu.a�adirConsumible(b1);

		Pedido pedido = new Pedido();

		Item i1 = new Item(p1, 2, p1.getPrecio());
		Item i2 = new Item(p2, 1, p2.getPrecio());
		Item i3 = new Item(b1, 3, b1.getPrecio());

		pedido.a�adirItemPedido(i1);
		pedido.a�adirItemPedido(i2);
		pedido.a�adirItemPedido(i3);

		pedido.confirmarPedido();

		TarjetaVisa tarjetaVisa = new TarjetaVisa();

		// Ejercitaci�n
		Pago pago = pedido.pagar(tarjetaVisa, 2);

		// Verificacion

		assertEquals(1780.41, pago.getMontoFinal());
	}

	@Test
	public void pagoTarjetaMastercard() {
		// Set up
		PlatoPrincipal p1 = new PlatoPrincipal("Pizza", 500);
		PlatoPrincipal p2 = new PlatoPrincipal("Lasagna", 600);

		Bebida b1 = new Bebida("Agua", 50);

		Menu menu = new Menu();

		menu.a�adirConsumible(p2);
		menu.a�adirConsumible(p1);

		menu.a�adirConsumible(b1);

		Pedido pedido = new Pedido();

		Item i1 = new Item(p1, 1, p1.getPrecio());
		Item i2 = new Item(p2, 3, p2.getPrecio());
		Item i3 = new Item(b1, 1, b1.getPrecio());

		pedido.a�adirItemPedido(i1);
		pedido.a�adirItemPedido(i2);
		pedido.a�adirItemPedido(i3);

		pedido.confirmarPedido();

		TarjetaMastercard tarjetaMastercard = new TarjetaMastercard();

		// Ejercitaci�n
		Pago pago = pedido.pagar(tarjetaMastercard, 3);

		// Verificacion

		assertEquals(2373.12, pago.getMontoFinal());
	}

	@Test
	public void pagoTarjetaComarcaPlus() {
		// Set up
		PlatoPrincipal p1 = new PlatoPrincipal("Pizza", 500);
		PlatoPrincipal p2 = new PlatoPrincipal("Lasagna", 600);

		Bebida b1 = new Bebida("Agua", 50);

		Menu menu = new Menu();

		menu.a�adirConsumible(p2);
		menu.a�adirConsumible(p1);

		menu.a�adirConsumible(b1);

		Pedido pedido = new Pedido();

		Item i1 = new Item(p1, 3, p1.getPrecio());
		Item i2 = new Item(p2, 2, p2.getPrecio());
		Item i3 = new Item(b1, 2, b1.getPrecio());

		pedido.a�adirItemPedido(i1);
		pedido.a�adirItemPedido(i2);
		pedido.a�adirItemPedido(i3);

		pedido.confirmarPedido();

		TarjetaComarcaPlus tarjetaComarcaPlus = new TarjetaComarcaPlus();

		// Ejercitaci�n
		Pago pago = pedido.pagar(tarjetaComarcaPlus, 5);

		// Verificacion
		assertEquals(2881.2, pago.getMontoFinal());
	}

	@Test
	public void pagoTarjetaViedma() {
		// Set up
		PlatoPrincipal p1 = new PlatoPrincipal("Pizza", 500);
		PlatoPrincipal p2 = new PlatoPrincipal("Lasagna", 600);

		Bebida b1 = new Bebida("Agua", 50);

		Menu menu = new Menu();

		menu.a�adirConsumible(p2);
		menu.a�adirConsumible(p1);

		menu.a�adirConsumible(b1);

		Pedido pedido = new Pedido();

		Item i1 = new Item(p1, 1, p1.getPrecio());
		Item i2 = new Item(p2, 1, p2.getPrecio());
		Item i3 = new Item(b1, 1, b1.getPrecio());

		pedido.a�adirItemPedido(i1);
		pedido.a�adirItemPedido(i2);
		pedido.a�adirItemPedido(i3);

		pedido.confirmarPedido();

		TarjetaViedma tarjetaViedma = new TarjetaViedma();

		// Ejercitaci�n
		Pago pago = pedido.pagar(tarjetaViedma, 3);

		// Verificacion
		assertEquals(1184.5, pago.getMontoFinal());
	}
}
