package org.generation.italy;
import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		
		//init scanner
		Scanner input = new Scanner(System.in);
		
		//init variables
		double distance;
		int age;
		double pricePKm = 0.21D;
		
		//greeting
		System.out.println("Good morning!");
		
		//scan user data
		System.out.print("Please enter travel distance in km: ");
		distance = input.nextDouble();
		
		System.out.print("Please enter your age: ");
		age = input.nextInt();
		
		double ticketPrice = distance * pricePKm;
		
		//conditions
		if (age < 18) {
			ticketPrice = (ticketPrice - ((ticketPrice * 20) / 100));
			
		} else if (age >= 65) {
			ticketPrice = (ticketPrice - ((ticketPrice * 40) / 100));
		
		} 
		
		System.out.println(("Your ticket fare is: ") + ticketPrice + "\u20AC");	
		System.out.println("Thank you for traveling with us!");
		
		
		input.close();
		
	}

}
