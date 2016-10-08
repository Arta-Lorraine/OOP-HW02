import java.util.Scanner;
public class KeyboardScanner {

	public static void main(String[] args) {
		int i;
		float y, mut;
		String name;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a integer: ");
		i = scanner.nextInt();
		System.out.print("Enter a float point number: ");
		y = scanner.nextFloat();
		System.out.print("Enter a you name: ");
		name = scanner.next();
		
		mut = i*y;
		
		System.out.print("Hi " + name);
		System.out.print("the multiplication of " +i);
		System.out.print(" and " +y);
		System.out.printf(" is %.2e\n", mut);
	}

}
