package org.lessons;

import java.util.Scanner;

public class Snack6 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci il numero massimo di cui calcolare il cubo");		
		int rn = sc.nextInt();
		
		for (int i = 1; i <= rn; i++) {
			
			System.out.println(i * i * i);
		}
		
		sc.close();
	}

}
