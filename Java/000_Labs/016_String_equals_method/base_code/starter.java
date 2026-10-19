import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Do ya wanna be a Cheeseburger, Hamburger or Apple.");
		String morph = sc.nextLine();

		if(morph.equals("cheeseburger") || morph.equals("Cheeseburger")){
			System.out.println("Bippity Boppity Boo. You are now a Cheesrbuger.");
		}

		else if(morph.equals("Hamburger") || morph.equals("hamburger")){
			System.out.println("Hocus Pocus! You are now a Hamburger :o");
			}
		else if(morph.equals("Apple") || morph.equals("apple")){
			System.out.println("A p p l e .");
			}
		else{
			System.out.println("Thats not an option you stinky poo poo");
		}
	}
}
