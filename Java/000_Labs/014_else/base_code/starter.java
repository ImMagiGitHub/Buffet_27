import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int a = (int)(Math.random()*999+1);
		System.out.println("Pick a whole number between 1 and 1,000:");
		int b = sc.nextInt();

		if (a == b){
		System.out.println("You got the correct random number!");
		}
		else if (a != b){
		System.out.println("Nope! Wrong anwser. The number was " + a + ".");
		}
	}
}
