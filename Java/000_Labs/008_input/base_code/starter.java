import java.util.Scanner;

class starter {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Whats your name?");
		String anwser1 = sc.nextLine();
		System.out.println("How old are you?");
		int anwser2 = sc.nextInt();
		System.out.println("What month were you born? (1-12)");
		int anwser3 = sc.nextInt();
		System.out.println("What day were you born? (1-31)");
		int anwser4 = sc.nextInt();
		System.out.println("What year were you born?");
		int anwser5 = sc.nextInt();
		System.out.println("If you have 1 dollar and 2 quarters, how much mulla do you have?");
		double anwser6 = sc.nextDouble();
		System.out.println("Your name is " + anwser1 + " and you were born " + anwser3 + "/" + anwser4 + "/" + anwser5 + ".");
		System.out.println("You are " + anwser2 + " years old :]");
		System.out.println("and I just stole your last " + anwser6 + " in your bank account.. MUHAHAHAHAHAH!!");
	}
}
