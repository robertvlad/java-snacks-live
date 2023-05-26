package org.lessons;

import java.util.Scanner;

public class Snack5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 6; i++) {
			
			System.out.println("Inserisci il numero: " + (i + 1));
			int nr = sc.nextInt();
			
			if (nr % 2 == 0) {
				
				System.out.println("Pari");
			}
			else {
				System.out.println("Disapri");
			}
			
			System.out.println("-----------------------------------------");
		}
		
		sc.close();
	}

}
