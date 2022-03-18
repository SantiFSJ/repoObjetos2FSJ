package punto1;

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

	public void inscribirParticipante(Participante unParticipante) {
		LocalDate fechaActual = LocalDate.now();
		if ((fechaActual.isBefore(fechaFinInscrip) && fechaActual.isAfter(fechaInicioInscrip))
				|| fechaActual.equals(fechaFinInscrip) || fechaActual.equals(fechaInicioInscrip)) {
			listaParticipantes.add(unParticipante);
			if (fechaActual.equals(fechaInicioInscrip)) {
				unParticipante.sumarPuntos(this.puntajeExtra);
			}
		} else {
			System.out.println("ERROR AL INSCRIBIR PARTICIPANTE, FUERA DE PLAZO");
		}
	}

	public Boolean estaInscripto(Participante unParticipante) {
		if (this.listaParticipantes.contains(unParticipante)) {
			return true;
		}
		return false;
	}

	public String getNombre() {
		return nombre;
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

}
