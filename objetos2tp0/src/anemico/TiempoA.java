package anemico;

public class TiempoA {
	// ANEMICO
	// Este Objeto resulta ser anemico, ya que pese a que hay objetos, estos ultimos
	// solo
	// sirven para contener algunos pocos datos y muy poca logica
	private int dia;
	private int mes;
	private int a�o;

	public TiempoA(int dia, int mes, int a�o) {
		this.dia = dia;
		this.mes = mes;
		this.a�o = a�o;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}
}
