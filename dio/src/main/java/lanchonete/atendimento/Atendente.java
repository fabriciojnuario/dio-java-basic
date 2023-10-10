package lanchonete.atendimento;

public class Atendente {
	public void servindoMesa() {
		pegarLancheCozinha();
		System.out.println("SERVINDO MESA.");
	}
	private void pegarLancheCozinha() {
		System.out.println("PEGANDO O LANCHE PARA SER SERVIDO.");
	}
	public void receberPagamento() {
		System.out.println("RECEBENDO O PAGAMENTO.");
	}
	public void pegarPedidoBalcao() {
		System.out.println("PEGANDO PEDIDO BALCAO");
	}
	void trocarGas() {
		System.out.println("TROCANDO O GAS");
	}
}
