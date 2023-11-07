package desafio_dio_banco;

public class Main {

	public static void main(String[] args){
		Cliente fabricio = new Cliente("fabricio");
		
		Conta cc = new ContaCorrente(fabricio);
		cc.depositar(100);
		Conta cp = new ContaPoupanca(fabricio);
		cp.depositar(200);
		cc.transferencia(80, cp);
		
		cc.extrato();
		cp.extrato();
	}

}
