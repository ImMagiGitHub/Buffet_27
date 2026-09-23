import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter a integer: ");
	int one = sc.nextInt();
	System.out.println("Now please enter a second integer (bigger then the first): ");
	int two = sc.nextInt();
	int numba1 = (int)(Math.random()*(two-one) + one);
	int numba2 = (int)(Math.random()*(two-one) + one);
	int numba3 = (int)(Math.random()*(two-one) + one);
	int numba4 = (int)(Math.random()*(two-one) + one);
	int numba5 = (int)(Math.random()*(two-one) + one);
	System.out.println("Your range is " + one + " to " + two);
	System.out.println("Here are 5 random numbers in that range: ");
	System.out.println(numba1 + ", " + numba2 + ", " + numba3 + ", " + numba4 + ", " + numba5);
	}
}
