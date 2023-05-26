package org.lessons;

import java.util.Scanner;

public class Snack8 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserischi un numero di 4 cifre");
		String nr = sc.nextLine();
		
		int sum = 0;
		
		for (int i = 0; i < nr.length(); i++) {
			
			int digit = Integer.parseInt("" + nr.charAt(i));
			
			sum += digit;
		}
		
		System.out.println(sum);
		
		sc.close();
	}

}
