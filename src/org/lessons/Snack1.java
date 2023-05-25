package org.lessons;

import java.util.Scanner;

public class Snack1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci il primo numero");
		int nr1 = sc.nextInt();
		
		System.out.println("Inserisci il secondo numero");
		int nr2 = sc.nextInt();
		
		if (nr1 == nr2) {
			
			System.out.println("I numeri sono identici");
		}
		else if (nr1 > nr2) {
			
			System.out.println("Il numero più grande è: " + nr1);
		}
		else {
			
			System.out.println("Il numero più grande è: " + nr2);
		}
		
		sc.close();
	}
}
