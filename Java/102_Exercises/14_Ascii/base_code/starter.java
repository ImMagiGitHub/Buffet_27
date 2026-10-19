import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to da Ascii Museum!");
		System.out.println("Pwease choose an exhibit :)");
		System.out.println("1. Linux");
		System.out.println("2. Food");
		System.out.println("3. Kirby");
		String option = sc.nextLine();

		if(option.equals("linux") || option.equals("Linux")){
			System.out.println("What version of the Linux penguin do you wanna see?");
			System.out.println("1. Baby Linux");
			System.out.println("2. Papa Linux");
			String linux = sc.nextLine();
			
				if(linux.equals("Baby Linux")){
					System.out.println("       .---.");
					System.out.println("      /     \\");
					System.out.println("      \\.@-@./");
					System.out.println("      /`\\_/`\\");
					System.out.println("     //  _  \\\\");
					System.out.println("    | \\     )|_");
					System.out.println("   /`\\_`>  <_/ \\");
					System.out.println("   \\__/'---'\\__/");
			}
				else if(linux.equals("Papa Linux")){
					System.out.println("         _nnnn_");
					System.out.println("        dGGGGMMb");
					System.out.println("       @p~qp~~qMb");
					System.out.println("       M|0||0) M|");
					System.out.println("       @,----.JM|");
					System.out.println("      JS^\\__//  qKL");
					System.out.println("     dZP        qKRb");
					System.out.println("    dZP          qKKb");
					System.out.println("   fZP            SMMb");
					System.out.println("   HZM            MMMM");
					System.out.println("   FqM            MMMM");
					System.out.println(" __| \".        |\\dS\"qML");
					System.out.println(" |    `.       | `' \\Zq");
					System.out.println("_)      \\.___.,|     .'");
					System.out.println("\\____   )MMMMMP|   .'");
					System.out.println("     `-'       `--' hjm");
			}
		}
		else if(option.equals("food") || option.equals("Food")){
			System.out.println("What food do you wanna see?");
			System.out.println("1. Pizza");
			System.out.println("2. Cheese");
			String food = sc.nextLine();

			if(food.equals("pizza") || food.equals("Pizza")){
			System.out.println("// \"\"--.._");
			System.out.println("||  (_)  _ \"-._");
			System.out.println("||    _ (_)    '-.");
			System.out.println("||   (_)   __..-'");
			System.out.println(" \\\\__..--\"\"");
			}
		else if(food.equals("cheese") || food.equals("Cheese")){
			System.out.println("          ___");					
			System.out.println("        .'o O'-._");
			System.out.println("       / O o_.-`|");
			System.out.println("      /O_.-'  O |");
			System.out.println("      | o   o .-`");
			System.out.println("      |o O_.-'");
			System.out.println("      '--`");
		}
	}
		else if(option.equals("kirby") || option.equals("Kirby")){
			System.out.println("What version of Kirby do ya wanna see?");
			System.out.println("1. KIRBY!");
			System.out.println("2. DANCIN KIRBY!!");
			String kirb = sc.nextLine();

			if(kirb.equals("KIRBY!")){
			System.out.println("(>'.')>");
			}
		else if(kirb.equals("DANCIN KIRBY!!")){
			System.out.println("<('-'<) ^('-')^ (>'-')>");
			}
		}

		else{
		System.out.println("No.");
		}
	}

}
