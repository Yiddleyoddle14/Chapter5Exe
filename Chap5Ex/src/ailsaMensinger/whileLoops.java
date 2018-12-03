package ailsaMensinger;
import java.util.Scanner;

/*
 * Ailsa Mensinger
 * 11-15-18
 */

public class whileLoops {
	
	public static void main(String[] args) {
		/*
		int count = 0;
		while (count < 100) {
			System.out.println(count+ " I will not be late to class");
			count ++;
		}
	
		System.out.println("Your lone hero is surrounded by a massive army of trolls.");
		System.out.println("Their decaying green bodies stretch out, melting into the horizon.");
		System.out.println("Your hero unsheathes his sword for the last fight of his life. \n");
		
		int health = 10;
		int trolls = 0;
		int damage = 3;
		
		while (health>0) {
			trolls ++;
			health = health-damage;
			System.out.println("Your hero swings and defeats an evil troll \n but takes " +
								damage + " damage points. \n");
		}
		System.out.println("Your hero fought valiantly and defeated " + trolls+ " trolls.");
		System.out.println("But alas, your hero is no more.");
		
		
		int sum = 0, i = 1;
		while (i<10) {
			sum = sum + i;
			i++;
		}
		System.out.println("sum is " + sum);
		*/
		int question = 1;
		
		while (question <11) {
			int number1 = (int)(Math.random() * 10);
			int number2 = (int)(Math.random() * 10);
			Scanner input = new Scanner(System.in);
			System.out.println(question+". What is " + number1 + " + " + number2 + "? ");
			int answer1 = input.nextInt();
			while (number1 + number2 != answer1) {
					System.out.println("Wrong answer. Try again. What is " +
							number1 + " + " + number2 + "? ");
					answer1 = input.nextInt();
			}
			System.out.println("You got it!");
			question++;
			
		}
		
		
		
	}

}
