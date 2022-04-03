package persistenciaConcurso;

import java.io.FileWriter;
import java.io.IOException;

import srcConcurso.RegistroDeInscripcion;

public class EnDiscoRegistroDeInscripcion implements RegistroDeInscripcion {

	public EnDiscoRegistroDeInscripcion() {
	}

	@Override
	public void archivar(String nombreYFecha) {
		try {
			FileWriter myWriter = new FileWriter("C:\\Users\\santi\\OneDrive\\Escritorio\\ListaParticipantes.txt",
					true);
			myWriter.write(nombreYFecha);
			myWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
