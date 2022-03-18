package punto1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class ConcursoTest {
	@Test
	public void InscripcionAConcurso() {
		// Set up
		Participante p1 = new Participante("40.000.000", "Juan", "Dominguez");

		LocalDate fechaIni = LocalDate.now().minusDays(5);

		LocalDate fechaFin = LocalDate.now().plusDays(5);

		Concurso c = new Concurso("Primer Concurso", fechaIni, fechaFin);

		// Ejercitación

		c.inscribirParticipante(p1);

		// Verificacion

		assertEquals(true, c.estaInscripto(p1));
	}

	@Test
	public void IncripcionEnPrimerDia() {
		// Set up
		Participante p2 = new Participante("35.000.000", "Julian", "Gonzalez");

		LocalDate fechaIni = LocalDate.now();

		LocalDate fechaFin = LocalDate.now().plusDays(10);

		Concurso c2 = new Concurso("Segundo Concurso", fechaIni, fechaFin);

		// Ejercitación

		c2.inscribirParticipante(p2);

		// Verificacion

		assertEquals(true, c2.estaInscripto(p2));// Quizas añadir comparacion con el puntaje extra esperado?

	}

	@Test
	public void InscricpcionFueraDePlazo() {
		// Set up
		Participante p3 = new Participante("30.000.000", "Miguel", "Martinez");

		LocalDate fechaIni = LocalDate.now().minusDays(20);

		LocalDate fechaFin = LocalDate.now().minusDays(10);

		Concurso c3 = new Concurso("Tercer Concurso", fechaIni, fechaFin);

		// Ejercitación

		c3.inscribirParticipante(p3);

		// Verificacion

		assertEquals(false, c3.estaInscripto(p3));
	}
}
