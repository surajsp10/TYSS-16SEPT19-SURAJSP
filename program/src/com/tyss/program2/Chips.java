package com.tyss.program2;

import java.util.Scanner;

public class Chips {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your option for the chips");
		int option = scan.nextInt();
		
		try {
		switch (option) {
		case 1 :
			System.out.println("KurKure");
			break;
		case 2:
			System.out.println("Bingo");
			break;
		case 3:
			System.out.println("Mad Angles");
		case 4:
			System.out.println("Lays");

		default:
			System.out.println("Please enter valid chips number");
			break;
		}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Please enter valid chips number");
		}
	}

}
