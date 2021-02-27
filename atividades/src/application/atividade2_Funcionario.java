package application;

import java.util.Scanner;

import entities.Employee;

public class atividade2_Funcionario {
	public static void main (String[] Args) {
		Scanner cs = new Scanner(System.in);
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = cs.nextLine();
		
		System.out.print("Gross salary: ");
		employee.grossSalary = cs.nextDouble();
		
		System.out.print("Tax: ");
		employee.tax = cs.nextDouble();
		
		System.out.println("Employee: " + employee);
		
		System.out.print("Which percentage to increase salary? ");
		double percentage;
		percentage = cs.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println("Update data: " + employee);
		
		cs.close();
	}
}
