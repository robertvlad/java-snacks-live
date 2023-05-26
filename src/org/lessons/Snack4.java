package org.lessons;

import java.util.Scanner;

public class Snack4 {
	
	public static void main(String[] args) {
		
		String[] names = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio, Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Come ti chiami?");
		String guest = sc.nextLine();
		
		boolean b = false;
		
		for (int i = 0; i < names.length; i++) {
			
			if (guest.equals(names[i])) {
				
				b = true;
			}
		}
		
		if (b == true) {
			
			System.out.println("Entra");
		}
		else {
			
			System.out.println("Non sei stato invitato");
		}
		
		sc.close();
	}

}
