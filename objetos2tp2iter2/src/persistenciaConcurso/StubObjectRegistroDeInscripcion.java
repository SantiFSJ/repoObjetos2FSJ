package persistenciaConcurso;

import srcConcurso.RegistroDeInscripcion;

public class StubObjectRegistroDeInscripcion implements RegistroDeInscripcion {
	private String registroGuardado;

	public StubObjectRegistroDeInscripcion() {
	}

	@Override
	public void archivar(String nombreYFecha) {
		registroGuardado = nombreYFecha;
	}

	public String registroGuardado() {
		return registroGuardado;
	}

}
