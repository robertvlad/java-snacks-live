package org.lessons;

import java.util.Scanner;

public class Snack2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci la prima parola");		
		String p1 = sc.nextLine();
		
		System.out.println("Inserisci la seconda parola");		
		String p2 = sc.nextLine();
		
		int p1lng = p1.length();
		int p2lng = p2.length();
		
		if (p1lng == p2lng) {
			
			System.out.println("Le due parole hanno la stessa lunghezza");
		}
		else if (p1lng > p2lng) {
			
			System.out.println(p1);
			System.out.println(p2);
		}
		else {
			
			System.out.println(p2);
			System.out.println(p1);
		}
		
		sc.close();
	}

}
