import java.util.Scanner;

class starter {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Width: ");
		int w = sc.nextInt();
		System.out.print("Height: ");
		int h = sc.nextInt();
		int wc = 0;
		int hc = 0;
		while(true){
			if(hc == h){
				break;
			}	
			wc = 0;
			while(true){
				if(wc == w){
					break;
				}
			System.out.print("*");
			wc = wc + 1;
			}
		System.out.println();
		hc = hc + 1;
		}
	}
}
