/**
 * 
 */
package escola;

/**
 * 
 */
public class Person {
	private String name;
	private String CPF;
	private String address;
	
	public Person(String cpf, String name) {
		this.CPF = cpf;
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public String getCPF() {
		return CPF;
	}

	
	
	
}
