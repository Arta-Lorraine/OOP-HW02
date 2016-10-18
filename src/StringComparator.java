import java.util.Scanner;
public class StringComparator {

	public static void main(String[] args) {
		
		String str1, str2;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a String1: ");
		str1 = scanner.next();
		System.out.print("Enter a String2: ");
		str2 = scanner.next();
		
		if (str1.equalsIgnoreCase(str2)){
			System.out.println("The two strings are the same.");
		}
		else{
			while (str1.equalsIgnoreCase(str2)==false)
			{
			System.out.println("The two strings are not the same.");
			System.out.print("Enter a String1: ");
			str1 = scanner.next();
			System.out.print("Enter a String2: ");
			str2 = scanner.next();
			}
		}
	}

}
