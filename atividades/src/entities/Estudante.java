package entities;

public class Estudante {
	public String nome;
	public double nota1, nota2, nota3;
	
	public double finalGrade() {
		return nota1 + nota2 + nota3;
	}
	
	public String aprovacao() {
		if(finalGrade() >= 60)
			return "Pass";
		else
			return "FAILED" + String.format("%n") 
			+ "MISSING " + String.format("%.2f", 60 - finalGrade()) + " POINTS" + String.format("%n"); 
	}
}
