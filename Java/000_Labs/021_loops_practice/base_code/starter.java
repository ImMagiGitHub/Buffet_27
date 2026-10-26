import java.util.Scanner;

class starter {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Guess the number!");
		System.out.println("Enter a number: ");
			int guess = sc.nextInt();
			int num = (int)(Math.random()*999+1);
		while(true){
		
		if(guess < num){
			System.out.println("The number is higher.");
		}
		else if(guess > num){
			System.out.println("The number is lower.");
		}
		else if(guess == num){
			System.out.println("Yes. The number was " + num + ".");
			break;
		}
		System.out.println("Enter a number: ");
			guess = sc.nextInt();
	}


		
	}
}
