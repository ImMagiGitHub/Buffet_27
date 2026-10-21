import java.util.Scanner;

class starter {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Number: ");
		int num = sc.nextInt();
		int e = 0;
		while(true){
			System.out.println(name);
				e = e + 1;
		if(e == num){
				break;
			}
		}
		
	}
}
