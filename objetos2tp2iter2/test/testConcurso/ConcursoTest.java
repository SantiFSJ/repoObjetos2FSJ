package testConcurso;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import srcConcurso.Concurso;
import srcConcurso.Participante;

public class ConcursoTest {
	@Test
	public void InscripcionAConcurso() {
		// Set up
		Participante p1 = new Participante("40.000.000", "Juan", "Dominguez");

		LocalDate fechaIni = LocalDate.now().minusDays(5);

		LocalDate fechaFin = LocalDate.now().plusDays(5);

		Concurso c = new Concurso("Primer Concurso", fechaIni, fechaFin);

		// Ejercitación

		File file = new File("C:\\Users\\santi\\OneDrive\\Escritorio\\ListaParticipantes.txt");
		c.inscribirParticipante(p1, file);

		// Verificacion
		assertEquals(true, c.estaInscripto(p1));

	}

	@Test
	public void InscripcionEnPrimerDia() {
		// Set up
		Participante p2 = new Participante("35.000.000", "Julian", "Gonzalez");

		LocalDate fechaIni = LocalDate.now();

		LocalDate fechaFin = LocalDate.now().plusDays(10);

		Concurso c2 = new Concurso("Segundo Concurso", fechaIni, fechaFin);

		// Ejercitación
		File file = new File("C:\\Users\\santi\\OneDrive\\Escritorio\\ListaParticipantes.txt");
		c2.inscribirParticipante(p2, file);

		// Verificacion
		assertEquals(true, c2.estaInscripto(p2));// Quizas añadir comparacion con el puntaje extra esperado?
		assertEquals(10, p2.puntos());

	}

	@Test
	public void InscripcionFueraDePlazo() {
		// Set up
		Participante p3 = new Participante("30.000.000", "Miguel", "Martinez");

		LocalDate fechaIni = LocalDate.now().minusDays(20);

		LocalDate fechaFin = LocalDate.now().minusDays(10);

		Concurso c3 = new Concurso("Tercer Concurso", fechaIni, fechaFin);

		// Ejercitación
		try {
			File file = new File("C:\\Users\\santi\\OneDrive\\Escritorio\\ListaParticipantes.txt");
			c3.inscribirParticipante(p3, file);
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}

		// Verificacion
		assertEquals(false, c3.estaInscripto(p3));
	}
}
