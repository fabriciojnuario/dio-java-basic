package desafio_dio_banco;

public interface IConta {
	void sacar(double valor);
	public void depositar(double valor);
	public void transferencia(double valor, Conta contaDestino);
	public void extrato();
}
