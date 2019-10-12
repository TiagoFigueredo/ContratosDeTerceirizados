package aplicattion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Employee> employees = new ArrayList<>();
		System.out.print("Enter the numer of employees:");
		int quantity = sc.nextInt();
		for(int i=1;i<=quantity;i++) {
			System.out.printf("Employee #%d data:\n",i);
			System.out.print("Outsourced (y/n)? ");
			char checks = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Hours: ");
			Integer hours = sc.nextInt();
			System.out.print("Value per hour: ");
			Double valueperhour = sc.nextDouble();
			if(checks=='n') {
				Employee employee = new Employee(name,hours,valueperhour);
				employees.add(employee);
			}
			else {
				System.out.print("Additional charge:");
				Double additional = sc.nextDouble();
				Employee employee = new OutsourcedEmployee(name,hours,valueperhour,additional);
				employees.add(employee);
			}
		}
		System.out.println("Paymentes:");
		for(Employee x : employees) {
			System.out.println(x);
		}
		
		sc.close();

	}

}
