package persistenciaRestaurante;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import persistenciaConcurso.ConnectionManager;
import srcRestaurante.RegistroDePago;

public class EnBaseDeDatosRegistroPagoRestaurante implements RegistroDePago {
	private Connection conn;

	public EnBaseDeDatosRegistroPagoRestaurante() {
	}

	@Override
	public void archivar(String fechaYNombre) {
		try {
			conn = ConnectionManager.getConnection();
			PreparedStatement statement = conn.prepareStatement("INSERT INTO pagos(registro) " + "VALUES (?)");
			statement.setString(1, fechaYNombre);
			statement.executeUpdate();

		} catch (SQLException e) {
			throw new RuntimeException("No se puedo conectar a la base de datos");
		} finally {
			ConnectionManager.disconnect();
		}
	}
}
