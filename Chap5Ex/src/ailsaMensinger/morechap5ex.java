package ailsaMensinger;

import java.util.Scanner;
/*
 * Ailsa Mensinger
 * 11-1-18
 */

public class morechap5ex {

	public static void main(String[] args) {
		//char x = input.next().charAt(0);
		
		Scanner input = new Scanner(System.in);
		
		String message = "Welcome to Java";
		String message2 = "Java is fun";
		//strings are a line of chars
		System.out.println(message.length());
		System.out.println("Welcome to Java".length());
		System.out.println(message.charAt(8));
		System.out.println(message+message2);
		System.out.println(message.concat(message2));
		
	
		
		/*
		String x = input.next();
		x = input.nextLine();
		*/
		
		if (!message.equals( "Welcome to Java")) {
			System.out.println("You're in");
		}
		else {
			System.out.println("You're not in");
		//if (!message.equals) means if message does not equal

		
	}
		
		

}
}
