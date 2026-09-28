import java.util.Scanner;

class starter {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please send a number!");
		int num1 = sc.nextInt();
		System.out.println("Please send another number!");
		int num2 = sc.nextInt();
		boolean a = num1 == num2;
		boolean b = num1 != num2;

		if(a){
		System.out.println("These numbers are the same!");
	}
		if(b){
		System.out.println("These number are diffrent!");

	}

	}
}
