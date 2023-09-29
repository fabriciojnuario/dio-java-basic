package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {
	public void adicionarLancheNoBalcao() {
		System.out.println("ADICIONANDO LANCHE NATURAL HAMBURGUER NO BALCÃO");
	}
	public void adicionarSucoNoBalcao() {
		System.out.println("ADICIONANDO SUCO NO BALCÃO.");
	}
	public void adicionarComboNoBalcao() {
		adicionarLancheNoBalcao();
		adicionarSucoNoBalcao();
	}
	
	public void prepararLanche() {
		System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER.");
	}
	
	public void prepararVitamina() {
		System.out.println("PREPARANDO A VITAMINA.");
	}
	public void prepararCombo() {
		prepararLanche();
		prepararVitamina();
	}
	public void selecionarIngredientesLanche() {
		System.out.println("SELECIONANDO PÃO SALADA, OVO E CARNE.");
	}
	public void selecionarIngredientesVitamina() {
		System.out.println("SELECIONANDO LEITE, FRUTAS E SUCO.");
	}
	public void lavarIngredientes() {
		System.out.println("LAVANDO INGREDIENTES.");
	}
	public void baterVitaminaLiquidificador() {
		System.out.println("BATENDO A VITAMINA NO LIQUIDIFICADOR.");
	}
	public void fritarIngredientesLanche() {
		System.out.println("FRITANDO A CARNE E OVO PARA O HAMBURGUER.");
	}
	public void pedirParaTrocarGas(Atendente meuamigo) {
		meuamigo.trocarGas();
	}
	public void pedirParaTrocarGas(Almoxarife meuamigo) {
		meuamigo.trocarGas();
	}
	public void pedirIngredientes(Almoxarife almoxarife) {
		almoxarife.entregarIngredientes();
	}
}

