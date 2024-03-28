package dto;

public class ViagemDTO {

	private double distancia;
	private int velocidadeMedia;

	public ViagemDTO(double distancia, int velocidadeMedia) {
		this.distancia = distancia;
		this.velocidadeMedia = velocidadeMedia;
	}

	public String calculaTempoViagem() {

		// Tempo em horas
		double tempoEmHoras = this.distancia / this.velocidadeMedia;

		// Horas e minutos
		int horas = (int) tempoEmHoras;
		int minutos = (int) ((tempoEmHoras - horas) * 60);

		return "O tempo de viagem é: " + horas + "horas e " + minutos + " minutos.";
	}

}
