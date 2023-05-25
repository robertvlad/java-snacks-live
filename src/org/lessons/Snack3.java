package org.lessons;

import java.util.Scanner;

public class Snack3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int somma = 0;
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.println("Inserisci il numero " + i + "*");			
			int nr = sc.nextInt();
			
			somma += nr;						
		}
		
		System.out.println(somma);
		
		sc.close();
	}
}
