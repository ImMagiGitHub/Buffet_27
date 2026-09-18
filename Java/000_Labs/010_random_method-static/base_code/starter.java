import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);
	
	int blah = (int)(Math.random()*9);
	int bluh = (int)(Math.random()*99+1);
	double bleh = Math.random()*0.5+2.5;
	double bloh = Math.random()*575+14;

	System.out.println("A number between 0 - 9:  " + blah);
	System.out.println("A number between 1 - 100: " + bluh);
	System.out.println("A double between 2.5 and 3.5:  " + bleh);
	System.out.println("A double between 14 and 589:   " + bloh);
	}
}
