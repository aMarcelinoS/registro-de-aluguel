package application;

import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		Rent [] vect = new Rent [10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		
		for (int i = 1; i<n; i++) {
			System.out.println();
			System.out.println("Rent #"+i+":");
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			vect [i] = new Rent (name, email);			
		}
		
		
		System.out.println("Busy rooms: ");
		
		
		
		
		
		
		sc.close();	
	}

}
