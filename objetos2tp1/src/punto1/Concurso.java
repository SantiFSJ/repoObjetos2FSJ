package punto1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Concurso {
	private String nombre;
	private LocalDate fechaInicioInscrip;
	private LocalDate fechaFinInscrip;
	private ArrayList<Participante> listaParticipantes;
	private int puntajeExtra = 10;

	public Concurso(String nombre, LocalDate fechaInicioInscrip, LocalDate fechaFinInscrip) {
		super();
		this.nombre = nombre;
		this.fechaInicioInscrip = fechaInicioInscrip;
		this.fechaFinInscrip = fechaFinInscrip;
		listaParticipantes = new ArrayList<Participante>();
	}

	public void inscribirParticipante(Participante unParticipante) {
		LocalDate fechaActual = LocalDate.now();
		if ((fechaActual.isBefore(fechaFinInscrip) && fechaActual.isAfter(fechaInicioInscrip))
				|| fechaActual.equals(fechaFinInscrip) || fechaActual.equals(fechaInicioInscrip)) {
			listaParticipantes.add(unParticipante);
			System.out.println("El Partipante fue Inscripto Correctamente");
			if (fechaActual.equals(fechaInicioInscrip)) {
				unParticipante.sumarPuntos(10);
				System.out.println("Le sumo puntos por primer dia de inscripcion");
			}
		} else {
			System.out.println("ERROR AL INSCRIBIR PARTICIPANTE, FUERA DE PLAZO");
		}
	}

	public void inscribirParticipante(Participante unParticipante, LocalDate unaFecha) {

		if ((unaFecha.isBefore(fechaFinInscrip) && unaFecha.isAfter(fechaInicioInscrip))
				|| unaFecha.equals(fechaFinInscrip) || unaFecha.equals(fechaInicioInscrip)) {
			listaParticipantes.add(unParticipante);
			System.out.println("El Partipante fue Inscripto Correctamente");
			if (unaFecha.equals(fechaInicioInscrip)) {
				unParticipante.sumarPuntos(this.puntajeExtra);
				System.out.println("Le sumo puntos por primer dia de inscripcion");
			}
		} else {
			System.out.println("ERROR AL INSCRIBIR PARTICIPANTE, FUERA DE PLAZO");
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaInicioInscrip() {
		return fechaInicioInscrip;
	}

	public void setFechaInicioInscrip(LocalDate fechaInicioInscrip) {
		this.fechaInicioInscrip = fechaInicioInscrip;
	}

	public LocalDate getFechaFinInscrip() {
		return fechaFinInscrip;
	}

	public void setFechaFinInscrip(LocalDate fechaFinInscrip) {
		this.fechaFinInscrip = fechaFinInscrip;
	}

	public ArrayList<Participante> getListaParticipantes() {
		return listaParticipantes;
	}

	public void setListaParticipantes(ArrayList<Participante> listaParticipantes) {
		this.listaParticipantes = listaParticipantes;
	}

}