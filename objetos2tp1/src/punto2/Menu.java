package punto2;

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

	public void a�adirConsumible(Consumible nuevoConsumible) {
		this.consumiblesMenu.add(nuevoConsumible);
	}

	public ArrayList<Consumible> getConsumiblesMenu() {
		return consumiblesMenu;
	}

	public void setConsumiblesMenu(ArrayList<Consumible> consumiblesMenu) {
		this.consumiblesMenu = consumiblesMenu;
	}

}