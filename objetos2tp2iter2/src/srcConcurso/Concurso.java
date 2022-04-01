package srcConcurso;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Concurso {
	private String nombre;
	private LocalDate fechaInicioInscrip;
	private LocalDate fechaFinInscrip;
	private ArrayList<Participante> listaParticipantes;
	private int puntajeExtra;

	public Concurso(String nombre, LocalDate fechaInicioInscrip, LocalDate fechaFinInscrip) {
		super();
		this.nombre = nombre;
		this.fechaInicioInscrip = fechaInicioInscrip;
		this.fechaFinInscrip = fechaFinInscrip;
		this.puntajeExtra = 10;
		listaParticipantes = new ArrayList<Participante>();
	}

	public void inscribirParticipante(Participante unParticipante, File file) {
		LocalDate fechaActual = LocalDate.now();
		if ((fechaActual.isBefore(fechaFinInscrip) && fechaActual.isAfter(fechaInicioInscrip))
				|| fechaActual.equals(fechaFinInscrip) || fechaActual.equals(fechaInicioInscrip)) {

			listaParticipantes.add(unParticipante);

			for (int i = 0; i < listaParticipantes.size(); i++) {

				try {
					FileWriter myWriter = new FileWriter(
							"C:\\Users\\santi\\OneDrive\\Escritorio\\ListaParticipantes.txt", true);
					myWriter.write(fechaActual.getDayOfMonth() + "/" + fechaActual.getMonthValue() + "/"
							+ fechaActual.getYear() + ", " + listaParticipantes.get(i).dni() + ", " + this.nombre
							+ "\n");
					myWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

				if (fechaActual.equals(fechaInicioInscrip)) {
					unParticipante.sumarPuntos(this.puntajeExtra);
				}

			}

		} else {
			throw new RuntimeException("Fuera de Plazo");
			// System.out.println("ERROR AL INSCRIBIR PARTICIPANTE, FUERA DE PLAZO");
		}
	}

	public Boolean estaInscripto(Participante unParticipante) {
		if (this.listaParticipantes.contains(unParticipante)) {
			return true;
		}
		return false;
	}

}
