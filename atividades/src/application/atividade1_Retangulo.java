package application;

import java.util.Scanner;

import entities.Rectangle;

public class atividade1_Retangulo {
	public static void main (String[] Args) {
		Scanner cs = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		rectangle.width = cs.nextDouble();
		rectangle.height = cs.nextDouble();
		
		System.out.println(rectangle);
		
		cs.close();
	}
}
