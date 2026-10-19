import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Whats your name?");
		String name = sc.nextLine();
		System.out.println("What is your duty in this world?");
		String duty = sc.nextLine();
		System.out.println("If you have a j*b, what is it?");
		String job = sc.nextLine();
		System.out.println("Amazing choices " + name + ". Time to start your adventure! You have 20 skill points, choose what you want to spend them on below!");
			
		int num = 20;

		System.out.println("Strength (1-10): ");
		int s = sc.nextInt();

		if(s>10){
			 System.out.println("I said 1-10!");
			 s = sc.nextInt();
		}
		if(s>num){
			System.out.println("Oop! You don't have enough points. Your points have been set to 0.");
			s = 0;
		}
		num = num - s;
		System.out.println("You have " + num + " left to spent!");


		System.out.println("Dexterity (1-10): ");
		int d = sc.nextInt();

		if(d>10){
			 System.out.println("I said 1-10!");
			 d = sc.nextInt();
		}
		if(d>num){
			System.out.println("Oop! You don't have enough points. Your points have been set to 0.");
			d = 0;
		}
		num = num - d;
		System.out.println("You have " + num + " left to spent!");

		System.out.println("Intelligence (1-10): ");
		int i = sc.nextInt();

		if(i>10){
			 System.out.println("I said 1-10!");
			 i = sc.nextInt();
			}
		if(i>num){
			System.out.println("Oop! You don't have enough points. Your points have been set to 0.");
			i = 0;
		}
		num = num - i;
		System.out.println("You have " + num + " left to spent!");

		System.out.println("Charisma (Rizz): ");
		int c = sc.nextInt();

		if(c>10){
			 System.out.println("I said 1-10!");
				c = sc.nextInt();
			}
		if(c>num){
			System.out.println("Oop! You don't have enough points. Your points have been set to 0.");
			c = 0;
		}

		System.out.println("Aight " + name + " the " + duty + " of this land!");
		System.out.println("Here are your skills " + job + "!");
		System.out.println("Strengh - " + s);
		System.out.println("Dexterity - " + d);
		System.out.println("Intelegince - " + i);
		System.out.println("Rizz - " + c);
		System.out.println("Good luck on your adventures " + name + "!");
	}
}
