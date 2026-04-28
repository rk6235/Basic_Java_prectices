package com.kodewala.Array;
import java.util.Scanner;

public class EmployeeSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] employees = new String[4];
		// Adding employee names to the array
		employees [0] = "Mohit";
		employees[1] = "Raj";
		employees [2] = "Sanjay";
		employees[3] = "Neha";
		
		// Prompt user to enter employee name to searc
		System.out.println("Enter Employe name to search : ");
		String searchName = sc.nextLine();
		boolean found = false;
		for(int i = 0; i < employees.length; i++)
		{
			if (employees[i].equalsIgnoreCase(searchName))
			{
				System.out.println("Employee found");
				found = true;
				break;
			}
		}
		if (!found)
		{
			System.out.println("Employee with name "+ searchName +" not found");
		}
		sc.close();
	}

}
