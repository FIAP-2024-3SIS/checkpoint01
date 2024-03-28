package br.com.fiap.cp01.ProjetoSGV;

import dto.ViagemDTO;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class ProjetoSgvApplication {

	public static void main(String[] args) {
//      SpringApplication.run(ProjetoSgvApplication.class, args);

	// Ajustar distância ou velocidadeMedia conforme necessário
	double distancia = 160.0;
	int velocidadeMedia = 100;

	// Cria o objeto ViagemDTO
	ViagemDTO viagem = new ViagemDTO(distancia, velocidadeMedia);

	// Chama o método e armazena o resultado
	String resultado = viagem.calculaTempoViagem();

	// Exibe o resultado
	System.out.println(resultado);
		
	}

}
