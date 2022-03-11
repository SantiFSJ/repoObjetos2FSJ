package anemico;

public class TiempoA {
	// ANEMICO
	// Este Objeto resulta ser anemico, ya que pese a que hay objetos, estos ultimos
	// solo
	// sirven para contener algunos pocos datos y muy poca logica
	private int dia;
	private int mes;
	private int año;

	public TiempoA(int dia, int mes, int año) {
		this.dia = dia;
		this.mes = mes;
		this.año = año;
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

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}
}
