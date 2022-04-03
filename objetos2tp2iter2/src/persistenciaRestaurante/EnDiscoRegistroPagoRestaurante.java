package persistenciaRestaurante;

import java.io.FileWriter;
import java.io.IOException;

import srcRestaurante.RegistroDePago;

public class EnDiscoRegistroPagoRestaurante implements RegistroDePago {
	public EnDiscoRegistroPagoRestaurante() {
	}

	@Override
	public void archivar(String fechaYPago) {
		try {
			FileWriter myWriter = new FileWriter("C:\\Users\\santi\\OneDrive\\Escritorio\\ListaPagosRestaurante.txt",
					true);
			myWriter.write(fechaYPago);
			myWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
