package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Cliente;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class atividade9_Order {

	public static void main(String[] args) throws ParseException {
		Scanner cs = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String name = cs.nextLine();
		System.out.print("Email: ");
		String email = cs.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthday = sdf.parse(cs.nextLine());
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String status = cs.nextLine();
		
		Order order = new Order(new Date(), OrderStatus.valueOf(status), new Cliente(name, email, birthday));
		
		System.out.print("How many item to this order?");
		int n = cs.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println("Enter #" + (i+1) + " item data:");
			System.out.print("Product name: ");
			cs.nextLine();
			String productName = cs.nextLine();
			System.out.print("Product price: ");
			double productPrice = cs.nextDouble();
			System.out.print("Quantity: ");
			int productQuantity = cs.nextInt();
			
			order.addItem(new OrderItem(productQuantity, productPrice, new Product(productName, productPrice)));
		}
		
		System.out.println("ORDER SUMMARY:");
		System.out.print(order);
		
		cs.close();
	}

}
