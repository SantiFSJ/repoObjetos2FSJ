package persistenciaConcurso;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import srcConcurso.RegistroDeInscripcion;

public class EnBaseDeDatosRegistroDeInscripcion implements RegistroDeInscripcion {
	private Connection conn;

	public EnBaseDeDatosRegistroDeInscripcion() {
	}

	@Override
	public void archivar(String nombreYFecha) {
		try {
			conn = ConnectionManager.getConnection();
			PreparedStatement statement = conn.prepareStatement("INSERT INTO inscripciones(registro) " + "VALUES (?)");
			statement.setString(1, nombreYFecha);
			statement.executeUpdate();

		} catch (SQLException e) {
			throw new RuntimeException("No se puedo conectar a la base de datos");
		} finally {
			ConnectionManager.disconnect();
		}
	}
}
