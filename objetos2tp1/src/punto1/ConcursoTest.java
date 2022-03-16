package punto1;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class ConcursoTest {
	@Test
	public void simpleAdd() {
		// Set up
		Participante p1 = new Participante("40.000.000", "Juan", "Dominguez");
		Participante p2 = new Participante("35.000.000", "Santiago", "Fernández");
		Participante p3 = new Participante("30.000.000", "Miguel", "Martinez");

		LocalDate fechaIni = LocalDate.of(2022, 3, 14);
		LocalDate fechaFin = LocalDate.of(2022, 3, 24);

		LocalDate fechaFueraPlazo = LocalDate.of(2022, 3, 26);
		LocalDate fechaDentroPlazo = LocalDate.of(2022, 3, 19);

		Concurso concurso = new Concurso("testConcurso", fechaIni, fechaFin);

		// Ejercitación
		concurso.inscribirParticipante(p3, fechaIni);
		concurso.inscribirParticipante(p2);
		concurso.inscribirParticipante(p1, fechaFueraPlazo);

		// Verificacion
		System.out.println(concurso.getListaParticipantes().toString());
	}
}
