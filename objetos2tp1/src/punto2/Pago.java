package punto2;

public class Pago {
	private String dni;
	protected float montoFinal;
	protected Pedido pedido;

	public Pago(String dni, Pedido pedido) {
		this.setDni(dni);
		this.pedido = pedido;
		this.montoFinal = this.pedido.getMontoTotal();
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

}
