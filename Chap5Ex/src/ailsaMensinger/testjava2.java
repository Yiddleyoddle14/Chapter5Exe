package ailsaMensinger;

import java.util.Scanner;

/*
 * Ailsa Mensinger
 * 11-5-18
 */

public class testjava2 {

	public static void main(String[] args) {
		
		String message = "Welcome to Java";
		
		System.out.println(message);
		
		System.out.println(message.indexOf("J"));
		System.out.println(message.indexOf("a",13));
		System.out.println(message.indexOf("to"));
		System.out.println(message.lastIndexOf("a"));
		
		
		String name = "";
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your first and last name");
		name = input.nextLine().atChar(0);
		
		if (name.isLetter()) {
			int name1 = Integer.parseInt(name);
		}
		else {
			System.out.println("That is not a number");
		}
		double name2 = Double.parseDouble(name);
		
		
		
		
	}

}
