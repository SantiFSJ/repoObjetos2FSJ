package testConcurso;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import persistenciaConcurso.StubObjectRegistroDeInscripcion;
import srcConcurso.Concurso;
import srcConcurso.Participante;

public class ConcursoTest {
	@Test
	public void InscripcionAConcurso() {
		// Set up
		Participante p1 = new Participante("40.000.000", "Juan", "Dominguez");

		LocalDate fechaIni = LocalDate.now().minusDays(5);

		LocalDate fechaFin = LocalDate.now().plusDays(5);

		// EnDiscoRegistroDeInscripcion registro = new EnDiscoRegistroDeInscripcion();

		// EnBaseDeDatosRegistroDeInscripcion registro = new
		// EnBaseDeDatosRegistroDeInscripcion();

		StubObjectRegistroDeInscripcion registro = new StubObjectRegistroDeInscripcion();

		Concurso c = new Concurso("Primer Concurso", fechaIni, fechaFin, registro);

		// Ejercitación

		File file = new File("C:\\Users\\santi\\OneDrive\\Escritorio\\ListaParticipantes.txt");
		c.inscribirParticipante(p1, file);

		// Verificacion
		assertEquals(true, c.estaInscripto(p1));

		LocalDate fecha = LocalDate.now();
		String rtadoEsperado = fecha.getDayOfMonth() + "/" + fecha.getMonthValue() + "/" + fecha.getYear()
				+ ", 40.000.000, Primer Concurso\n";
		assertEquals(rtadoEsperado, registro.registro());

	}

	@Test
	public void InscripcionEnPrimerDia() {
		// Set up
		Participante p2 = new Participante("35.000.000", "Julian", "Gonzalez");

		LocalDate fechaIni = LocalDate.now();

		LocalDate fechaFin = LocalDate.now().plusDays(10);

		// EnDiscoRegistroDeInscripcion registro = new EnDiscoRegistroDeInscripcion();

		// EnBaseDeDatosRegistroDeInscripcion registro = new
		// EnBaseDeDatosRegistroDeInscripcion();

		StubObjectRegistroDeInscripcion registro = new StubObjectRegistroDeInscripcion();

		Concurso c2 = new Concurso("Segundo Concurso", fechaIni, fechaFin, registro);

		// Ejercitación
		File file = new File("C:\\Users\\santi\\OneDrive\\Escritorio\\ListaParticipantes.txt");
		c2.inscribirParticipante(p2, file);

		// Verificacion
		assertEquals(true, c2.estaInscripto(p2));
		assertEquals(10, p2.puntos());

		LocalDate fecha = LocalDate.now();
		String rtadoEsperado = fecha.getDayOfMonth() + "/" + fecha.getMonthValue() + "/" + fecha.getYear()
				+ ", 35.000.000, Segundo Concurso\n";

		assertEquals(rtadoEsperado, registro.registro());
	}

	@Test
	public void InscripcionFueraDePlazo() {
		// Set up
		Participante p3 = new Participante("30.000.000", "Miguel", "Martinez");

		LocalDate fechaIni = LocalDate.now().minusDays(20);

		LocalDate fechaFin = LocalDate.now().minusDays(10);

		// EnDiscoRegistroDeInscripcion registro = new EnDiscoRegistroDeInscripcion();

		StubObjectRegistroDeInscripcion registro = new StubObjectRegistroDeInscripcion();

		Concurso c3 = new Concurso("Tercer Concurso", fechaIni, fechaFin, registro);

		// Ejercitación
		try {
			File file = new File("C:\\Users\\santi\\OneDrive\\Escritorio\\ListaParticipantes.txt");
			c3.inscribirParticipante(p3, file);
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}

		// Verificacion

		assertEquals(false, c3.estaInscripto(p3));

		assertEquals(null, registro.registro());
	}

}
