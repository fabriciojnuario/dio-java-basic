package lanchonete.atendimento.cozinha;

public class Almoxarife {
	private void controlarEntrada() {
		System.out.println("CONTROLANDO A ENTRADA DO FLUXO.");
	}
	private void controlarSaida() {
		System.out.println("CONTROLANDO A SAIDA DO FLUXO.");
	}

	void trocarGas() {
		System.out.println("ALMOXARIFE TROCANDO O GÁS.");
	}

	void entregarIngredientes() {
		System.out.println("ENTREGANDO INGREDIENTES.");
		controlarSaida();
		
	}
}

