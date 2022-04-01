package srcRestaurante;

import java.util.ArrayList;

public class Menu {
	private ArrayList<Consumible> consumiblesMenu;

	public Menu(ArrayList<Consumible> listaAlimentos) {
		super();
		this.consumiblesMenu = listaAlimentos;
	}

	public Menu() {
		super();
		this.consumiblesMenu = new ArrayList<Consumible>();
	}

	public void añadirConsumible(Consumible nuevoConsumible) {
		this.consumiblesMenu.add(nuevoConsumible);
	}

	public ArrayList<Consumible> consumiblesMenu() {
		return consumiblesMenu;
	}

}
