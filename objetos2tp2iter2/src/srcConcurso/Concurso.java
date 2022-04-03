package srcConcurso;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;

public class Concurso {
	private String nombre;
	private LocalDate fechaInicioInscrip;
	private LocalDate fechaFinInscrip;
	private ArrayList<Participante> listaParticipantes;
	private int puntajeExtra;
	private int id;
	private RegistroDeInscripcion registro;

	public Concurso(String nombre, LocalDate fechaInicioInscrip, LocalDate fechaFinInscrip,
			RegistroDeInscripcion registro) {
		super();
		this.nombre = nombre;
		this.fechaInicioInscrip = fechaInicioInscrip;
		this.fechaFinInscrip = fechaFinInscrip;
		this.puntajeExtra = 10;
		this.registro = registro;
		listaParticipantes = new ArrayList<Participante>();
	}

	public void inscribirParticipante(Participante unParticipante, File file) {
		LocalDate fechaActual = LocalDate.now();
		if ((fechaActual.isBefore(fechaFinInscrip) && fechaActual.isAfter(fechaInicioInscrip))
				|| fechaActual.equals(fechaFinInscrip) || fechaActual.equals(fechaInicioInscrip)) {

			listaParticipantes.add(unParticipante);

			String nombreYFecha = fechaActual.getDayOfMonth() + "/" + fechaActual.getMonthValue() + "/"
					+ fechaActual.getYear() + ", " + unParticipante.dni() + ", " + this.nombre + "\n";

			registro.archivar(nombreYFecha);

			if (fechaActual.equals(fechaInicioInscrip)) {
				unParticipante.sumarPuntos(this.puntajeExtra);
			}

		} else {
			throw new RuntimeException("Fuera de Plazo");

		}
	}

	public Boolean estaInscripto(Participante unParticipante) {
		if (this.listaParticipantes.contains(unParticipante)) {
			return true;
		}
		return false;
	}

}
