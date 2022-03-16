package punto2;

import org.junit.jupiter.api.Test;

public class RestauranteTest {
	@Test
	public void simpleAdd() {
		// Set up
		PlatoPrincipal p1 = new PlatoPrincipal("Pizza", 500);
		PlatoPrincipal p2 = new PlatoPrincipal("Lasagna", 600);
		PlatoPrincipal p3 = new PlatoPrincipal("Milanesa con Pure", 450);

		Bebida b1 = new Bebida("Agua", 50);
		Bebida b2 = new Bebida("Vino", 80);
		Bebida b3 = new Bebida("Coca Cola", 100);

		Menu menu = new Menu();
		menu.a�adirConsumible(p3);
		menu.a�adirConsumible(p2);
		menu.a�adirConsumible(p1);

		menu.a�adirConsumible(b3);
		menu.a�adirConsumible(b2);
		menu.a�adirConsumible(b1);

		// Ejercitaci�n

		// Verificacion

	}
}
