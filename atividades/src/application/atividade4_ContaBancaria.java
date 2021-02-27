package application;

import java.util.Scanner;

import entities.ContaBancaria;

public class atividade4_ContaBancaria {
	public static void main (String[] Args) {
		Scanner cs = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int conta = cs.nextInt();
		System.out.print("Enter account holder: ");
		cs.nextLine();
		String nome = cs.nextLine();
		System.out.print("Is there an initial deposit (y/n)?");
		double saldo = 0;
		char quest = cs.next().charAt(0);
		if(quest == 'y') {
			System.out.print("Enter initial deposit value: ");
			saldo = cs.nextInt();
		}
		ContaBancaria account = new ContaBancaria(conta, nome, saldo);
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		saldo = cs.nextInt();
		account.deposit(saldo);
		System.out.println();
		System.out.println("Updated account data:");
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		saldo = cs.nextDouble();
		account.retirada(saldo);
		System.out.println();
		System.out.println("Updated account data:");
		System.out.println(account);
		System.out.println();
		
		
		
		cs.close();
	}
}
