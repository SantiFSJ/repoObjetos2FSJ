package testRestaurante;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;

import org.junit.jupiter.api.Test;

import srcRestaurante.Bebida;
import srcRestaurante.Menu;
import srcRestaurante.Pago;
import srcRestaurante.Pedido;
import srcRestaurante.PlatoPrincipal;
import srcRestaurante.TarjetaComarcaPlus;
import srcRestaurante.TarjetaMastercard;
import srcRestaurante.TarjetaViedma;
import srcRestaurante.TarjetaVisa;

public class RestauranteTest {
	@Test
	public void pagoTarjetaVisa() {
		// Set up
		PlatoPrincipal p1 = new PlatoPrincipal("Pizza", 500);
		PlatoPrincipal p2 = new PlatoPrincipal("Lasagna", 600);

		Bebida b1 = new Bebida("Agua", 50);

		Menu menu = new Menu();

		menu.añadirConsumible(p2);
		menu.añadirConsumible(p1);

		menu.añadirConsumible(b1);

		Pedido pedido = new Pedido();

		pedido.añadirPlato(p1);
		pedido.añadirPlato(p1);
		pedido.añadirPlato(p2);
		pedido.añadirBebida(b1);
		pedido.añadirBebida(b1);
		pedido.añadirBebida(b1);

		pedido.confirmarPedido();

		TarjetaVisa tarjetaVisa = new TarjetaVisa();

		// Ejercitación
		Pago pago = pedido.pagar(tarjetaVisa, 2);

		File file = new File("C:\\Users\\santi\\OneDrive\\Escritorio\\CostoTotal.txt");
		pago.archivar(file);

		// Verificacion
		assertEquals(1780.41, pago.montoFinal());

	}

	@Test
	public void pagoTarjetaMastercard() {
		// Set up
		PlatoPrincipal p1 = new PlatoPrincipal("Pizza", 500);
		PlatoPrincipal p2 = new PlatoPrincipal("Lasagna", 600);

		Bebida b1 = new Bebida("Agua", 50);

		Menu menu = new Menu();

		menu.añadirConsumible(p2);
		menu.añadirConsumible(p1);

		menu.añadirConsumible(b1);

		Pedido pedido = new Pedido();

		pedido.añadirPlato(p1);
		pedido.añadirPlato(p2);
		pedido.añadirPlato(p2);
		pedido.añadirPlato(p2);
		pedido.añadirBebida(b1);

		pedido.confirmarPedido();

		TarjetaMastercard tarjetaMastercard = new TarjetaMastercard();

		// Ejercitación
		Pago pago = pedido.pagar(tarjetaMastercard, 3);

		File file = new File("C:\\Users\\santi\\OneDrive\\Escritorio\\CostoTotal.txt");
		pago.archivar(file);

		// Verificacion
		assertEquals(2373.12, pago.montoFinal());

	}

	@Test
	public void pagoTarjetaComarcaPlus() {
		// Set up
		PlatoPrincipal p1 = new PlatoPrincipal("Pizza", 500);
		PlatoPrincipal p2 = new PlatoPrincipal("Lasagna", 600);

		Bebida b1 = new Bebida("Agua", 50);

		Menu menu = new Menu();

		menu.añadirConsumible(p2);
		menu.añadirConsumible(p1);

		menu.añadirConsumible(b1);

		Pedido pedido = new Pedido();

		pedido.añadirPlato(p1);
		pedido.añadirPlato(p1);
		pedido.añadirPlato(p1);
		pedido.añadirPlato(p2);
		pedido.añadirPlato(p2);
		pedido.añadirBebida(b1);
		pedido.añadirBebida(b1);
		pedido.confirmarPedido();

		TarjetaComarcaPlus tarjetaComarcaPlus = new TarjetaComarcaPlus();

		// Ejercitación
		Pago pago = pedido.pagar(tarjetaComarcaPlus, 5);

		File file = new File("C:\\Users\\santi\\OneDrive\\Escritorio\\CostoTotal.txt");
		pago.archivar(file);

		// Verificacion
		assertEquals(2881.2, pago.montoFinal());

	}

	@Test
	public void pagoTarjetaViedma() {
		// Set up
		PlatoPrincipal p1 = new PlatoPrincipal("Pizza", 500);
		PlatoPrincipal p2 = new PlatoPrincipal("Lasagna", 600);

		Bebida b1 = new Bebida("Agua", 50);

		Menu menu = new Menu();

		menu.añadirConsumible(p2);
		menu.añadirConsumible(p1);

		menu.añadirConsumible(b1);

		Pedido pedido = new Pedido();

		pedido.añadirPlato(p1);
		pedido.añadirPlato(p2);
		pedido.añadirBebida(b1);

		pedido.confirmarPedido();

		TarjetaViedma tarjetaViedma = new TarjetaViedma();

		// Ejercitación
		Pago pago = pedido.pagar(tarjetaViedma, 3);

		File file = new File("C:\\Users\\santi\\OneDrive\\Escritorio\\CostoTotal.txt");
		pago.archivar(file);

		// Verificacion
		assertEquals(1184.5, pago.montoFinal());

	}
}
