package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = cs.nextLine();
		System.out.print("Price: ");
		double price = cs.nextDouble();
		System.out.print("Quantity: ");
		int quantity = cs.nextInt();
		
		Product product  = new Product(name, price, quantity);
		
		product.setName("Computer");
		System.out.println("Upadted name: " + product.getName());
		
		// System.out.println(product.name + ", " + product.price + ", " + product.quantity);
		// A linha acima foi substituida pelo toString do pacote Product 
		
		System.out.println(); // somente para dar um Enter a mais na saída
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of the products to be added in stock: ");
		quantity = cs.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of the products to be removed in stock: ");
		quantity = cs.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		cs.close();
	}
}
