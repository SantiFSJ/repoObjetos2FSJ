package srcConcurso;

import java.time.LocalDate;

import persistenciaConcurso.EnBaseDeDatosRegistroDeInscripcion;
import persistenciaConcurso.EnDiscoRegistroDeInscripcion;

public class Main {
	public static void main(String[] args) {
		// Para Guardar en Disco
		Participante p1 = new Participante("40.000.000", "Emiliano", "Martinez");

		LocalDate fechaIni = LocalDate.now().minusDays(5);

		LocalDate fechaFin = LocalDate.now().plusDays(5);

		EnDiscoRegistroDeInscripcion registroEnDis = new EnDiscoRegistroDeInscripcion();

		Concurso concurso1 = new Concurso("Decimo Concurso", fechaIni, fechaFin, registroEnDis);

		concurso1.inscribirParticipante(p1);

		// Para Guardar en Base de Datos
		Participante p2 = new Participante("40.000.000", "Emiliano", "Martinez");

		EnBaseDeDatosRegistroDeInscripcion registroEnBase = new EnBaseDeDatosRegistroDeInscripcion();

		Concurso concurso2 = new Concurso("Decimo Concurso", fechaIni, fechaFin, registroEnBase);

		concurso2.inscribirParticipante(p2);

	}

}
