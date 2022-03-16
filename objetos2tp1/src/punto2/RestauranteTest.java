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
		menu.añadirConsumible(p3);
		menu.añadirConsumible(p2);
		menu.añadirConsumible(p1);

		menu.añadirConsumible(b3);
		menu.añadirConsumible(b2);
		menu.añadirConsumible(b1);

		// Ejercitación

		// Verificacion

	}
}
