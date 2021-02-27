package application;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import entities.Employee2;

public class atividade6_Employee2 {
	public static void main (String[] Args) {
		Scanner cs = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int n = cs.nextInt();
		
		List<Employee2> list = new ArrayList<>();
		
		for (int i=0; i<n; i++) {
			
			System.out.println("Employee #" + (i+1));
			System.out.print("Id: ");
			int id = cs.nextInt();
			System.out.print("Name: ");
			cs.nextLine();
			String name = cs.nextLine();
			System.out.print("Salary: ");
			double salary = cs.nextDouble();
			
			Employee2 emp = new Employee2(id, name, salary);
			list.add(emp);
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = cs.nextInt();
		Integer pos = position(list, id);
		
		if(pos == null)
			System.out.println("This id does not exist!");
		else {
			System.out.print("Enter the percentage: ");
			double percent = cs.nextDouble();
			list.get(pos).increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for(Employee2 em : list) {
			System.out.println(em);
		}
		
		cs.close();	
	}
	
	public static Integer position(List<Employee2> list , int id) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getId() == id)
				return i;
		}
		return null;
	}
	
}
