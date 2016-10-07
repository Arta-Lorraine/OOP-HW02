import java.util.Scanner;
public class CheckOddEven {

	public static void main(String[] args) {
		
		int i, y;
		Scanner scanner = new Scanner(System.in)
;		
		System.out.print("Enter a integer: ");
		i = scanner.nextInt();
		y = i % 2;
		
		if (y != 0){
			System.out.println("The input integer is Odd Number.");
		}
		else{
			System.out.println("The input integer is Even Number.");
		}
		
		

	}

}
