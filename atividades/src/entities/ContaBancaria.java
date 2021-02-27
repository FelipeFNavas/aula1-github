package entities;

public class ContaBancaria {
	private int numeroConta;
	private String nome;
	private double saldo;
	
	public ContaBancaria(int numeroConta, String nome, double saldo) {
		super();
		this.numeroConta = numeroConta;
		this.nome = nome;
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public String toString() {
		return "Account " 
				+ getNumeroConta()
				+ ", Holder: "
				+ getNome()
				+ ", Balance: $ "
				+ String.format("%.2f", getSaldo());
	}
	
	public void deposit(double saldo) {
		this.saldo += saldo;
	}
	
	public void retirada(double retirada) {
		this.saldo -= (retirada+5);
	}
}
