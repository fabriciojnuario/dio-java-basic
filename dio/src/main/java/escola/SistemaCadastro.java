package escola;

public class SistemaCadastro {

	public static void main(String[] args) {
		 Person person = new Person("21365892886", "Fabricio");
		
		System.out.println("The person ".concat(person.getName()).concat(" has a cpf ")
							.concat(String.valueOf(person.getCPF())));

	}

}
