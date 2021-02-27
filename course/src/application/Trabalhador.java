package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Trabalhador {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner cs = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String departmentName = cs.nextLine();
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String workerName = cs.nextLine();
		System.out.print("level: ");
		String workerLevel = cs.nextLine();
		System.out.print("Base salary: ");
		double workerBaseSalary = cs.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerBaseSalary, new Department(departmentName));
		
		System.out.print("How many contracts to this worker? ");
		int n = cs.nextInt();
		for(int i=0; i<n; i++) {
			System.out.println("Enter contract number #" + (i+1) + " data:");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(cs.next());
			System.out.print("Value of hour: ");
			double valuePerHour = cs.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = cs.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = cs.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		System.out.println();
		
		cs.close();
	}

}
