package entities;

public class Pensao {
	private String name;
	private String email;
	
	public String toString() {
		return name 
				+ ", "
				+ email
				+ String.format("%n");
	}
	
	public Pensao(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
