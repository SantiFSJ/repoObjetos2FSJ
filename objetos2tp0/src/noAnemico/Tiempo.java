package noAnemico;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Tiempo {
	// NO ANEMICO
	private Date fechaHoy;

	public Tiempo(Date fechaHoy) {
		this.fechaHoy = fechaHoy;
	}

	public void imprimirEnFormatoCorto() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String fecha = formatter.format(fechaHoy);
		System.out.println("Formato Corto: " + fecha);
	}

	public void imprimirEnFormatoLargo() {
		Calendar c = Calendar.getInstance();
		c.setTime(fechaHoy);
		String diaTexto = new SimpleDateFormat("EEEE").format(fechaHoy);
		String mesTexto = new SimpleDateFormat("MMMM").format(fechaHoy);
		System.out.println("Formato Largo: " + diaTexto + " " + c.get(Calendar.DAY_OF_MONTH) + " de " + mesTexto
				+ " del " + c.get(Calendar.YEAR));
	}
}
