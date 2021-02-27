package application;

import java.util.Scanner;

import entities.Estudante;

public class atividade3_Estudante {
	public static void main (String[] Args) {
		Scanner cs = new Scanner(System.in);
		Estudante est = new Estudante();
		
		est.nome = cs.nextLine();
		est.nota1 = cs.nextDouble();
		est.nota2 = cs.nextDouble();
		est.nota3 = cs.nextDouble();
		
		System.out.println("FINAL GRADE = " + String.format("%.2f", est.finalGrade()));
		System.out.println(est.aprovacao());
		
		cs.close();
	}
}
