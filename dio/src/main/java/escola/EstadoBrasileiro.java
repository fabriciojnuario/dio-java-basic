package escola;

public enum EstadoBrasileiro {
	SAO_PAULO("SP", "São Paulo", 12),
	RIO_JANEIRO("RJ", "Rio de Janeiro", 13),
	PIAUI("PI", "Piauí", 14),
	MARANHAO("MA", "Maranhão", 15),
	CEARA("CE", "Ceará", 34);


	private String sigla;
	private int ibge;
	private String nome;
	
	private EstadoBrasileiro(String sigla, String nome, int ibge) {
		this.nome = nome;
		this.sigla = sigla;
		this.ibge = ibge;
	}
	
	
	public int getIbge() {
		return ibge;
	}


	public String getSigla() {
		return sigla;
	}

	public String getNome() {
		return nome;
	}
	
	public String getMaiusculo() {
		return nome.toUpperCase();
	}
}
