package org.lessons;

public class Snack9 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			
			sum += i;
		}
		
		System.out.println(sum);
		
		double avg = (double) sum / 2;
		System.out.println(avg);
	}
}
