package punto2;

public class Estado {

	private String estado;
	private static final String PENDIENTE = "PENDIENTE";
	private static final String CONFIRMADO = "CONFIRMADO";

	public Estado() {
		this.estado = PENDIENTE;
	}

	public String getEstado() {
		return estado;
	}

	public void confirmar() {
		if (estado.equals(PENDIENTE)) {
			this.estado = CONFIRMADO;
		} else {
			System.out.println("El Estado NO se puede modificar una vez confirmado");
		}
	}

	public boolean confirmado() {
		return estado.equals(CONFIRMADO);
	}

	public boolean pendiente() {
		return estado.equals(PENDIENTE);
	}

}
