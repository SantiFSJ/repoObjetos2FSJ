package testConcurso;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

		StubObjectRegistroDeInscripcion registro = new StubObjectRegistroDeInscripcion();

		Concurso c = new Concurso("Primer Concurso", fechaIni, fechaFin, registro);

		// Ejercitación
		c.inscribirParticipante(p1);

		// Verificacion
		assertEquals(true, c.estaInscripto(p1));

		LocalDate fecha = LocalDate.now();
		String rtadoEsperado = fecha.getDayOfMonth() + "/" + fecha.getMonthValue() + "/" + fecha.getYear()
				+ ", 40.000.000, Primer Concurso\n";

		assertEquals(rtadoEsperado, registro.registroGuardado());

	}

	@Test
	public void InscripcionEnPrimerDia() {
		// Set up
		Participante p2 = new Participante("35.000.000", "Julian", "Gonzalez");

		LocalDate fechaIni = LocalDate.now();

		LocalDate fechaFin = LocalDate.now().plusDays(10);

		StubObjectRegistroDeInscripcion registro = new StubObjectRegistroDeInscripcion();

		Concurso c2 = new Concurso("Segundo Concurso", fechaIni, fechaFin, registro);

		// Ejercitación
		c2.inscribirParticipante(p2);

		// Verificacion
		assertEquals(true, c2.estaInscripto(p2));
		assertEquals(10, p2.puntos());

		LocalDate fecha = LocalDate.now();
		String rtadoEsperado = fecha.getDayOfMonth() + "/" + fecha.getMonthValue() + "/" + fecha.getYear()
				+ ", 35.000.000, Segundo Concurso\n";

		assertEquals(rtadoEsperado, registro.registroGuardado());
	}

	@Test
	public void InscripcionFueraDePlazo() {
		// Set up
		Participante p3 = new Participante("30.000.000", "Miguel", "Martinez");

		LocalDate fechaIni = LocalDate.now().minusDays(20);

		LocalDate fechaFin = LocalDate.now().minusDays(10);

		StubObjectRegistroDeInscripcion registro = new StubObjectRegistroDeInscripcion();

		Concurso c3 = new Concurso("Tercer Concurso", fechaIni, fechaFin, registro);

		// Ejercitación
		try {
			c3.inscribirParticipante(p3);
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}

		// Verificacion

		assertEquals(false, c3.estaInscripto(p3));

		assertEquals(null, registro.registroGuardado());
	}

}
