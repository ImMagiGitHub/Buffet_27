/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);

	double max = Math.max(13 - 6 * 11, 30 % 7 * (-2));
	double sqrt = Math.sqrt(3 * 8 + 31 % 7);
	double pow = Math.pow(37 / 3, 35 % 21);
	double max2 = Math.max(Math.pow( 2,14%3),Math.sqrt( 2*6) );


	System.out.println("Maximum = " + max);
	System.out.println("Square root = " + sqrt);
	System.out.println("Power = " + pow);
	System.out.println("Max = " + max2);

	
	}
}