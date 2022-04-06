package persistenciaRestaurante;

import srcRestaurante.RegistroDePago;

public class StubObjectRegistroPagoRestaurante implements RegistroDePago {

	private String registroGuardado;

	@Override
	public void archivar(String fechaYPago) {
		registroGuardado = fechaYPago;
	}

	public String registroGuardado() {
		return registroGuardado;
	}
}
