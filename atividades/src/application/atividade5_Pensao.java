package application;

import java.util.Scanner;

import entities.Pensao;

public class atividade5_Pensao {

	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int n = cs.nextInt();
		Pensao[] p = new Pensao[10];
		
		for(int i=0; i<n; i++) {
			System.out.println();
			System.out.println("Rent #" + (i+1) + ":");
			System.out.print("Name: ");
			cs.nextLine();
			String name = cs.nextLine();
			System.out.print("Email: ");
			String email = cs.nextLine();
			System.out.print("Room: ");
			int room = cs.nextInt();
			
			p[room] = new Pensao(name, email);
		}
		
		System.out.println();
		System.out.println("Busy Rooms:");
		
		for(int i=0; i<10; i++) {
			if(p[i] != null)
				System.out.println(i + ": " + p[i]);
		}
		
		cs.close();
	}

}
