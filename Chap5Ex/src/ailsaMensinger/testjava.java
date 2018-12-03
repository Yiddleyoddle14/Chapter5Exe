package ailsaMensinger;

import java.util.Scanner;

/*
 * Ailsa Mensinger
 * 10-30-18
 */

public class testjava {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		char char1 = '!';
		char char2 = 'd';
		char char3 = 't';
		char char4 = 'e';
		char char5 = '@';
		
		char num0 = '\u0030';
		char num1 = '\u0031';
		char num2 = '\u0032';
		char num3 = '\u0033';
		char num4 = '\u0034';
		char num5 = '\u0035';
		char num6 = '\u0036';
		char num7 = '\u0037';
		char num8 = '\u0038';
		char num9 = '\u0039';
		
		//letters A-Z
		char letA = '\u0041';
		char letB = '\u0042';
		char letC = '\u0043';
		char letD = '\u0044';
		char letE = '\u0045';
		char letF = '\u0046';
		char letG = '\u0047';
		char letH = '\u0048';
		char letI = '\u0049';
		char letJ = '\u004A';
		char letK = '\u004B';
		char letL = '\u004C';
		char letM = '\u004D';
		char letN = '\u004E';
		char letO = '\u004F';
		char letP = '\u0050';
		char letQ = '\u0051';
		char letR = '\u0052';
		char letS = '\u0053';
		char letT = '\u0054';
		char letU = '\u0055';
		char letV = '\u0056';
		char letW = '\u0057';
		char letX = '\u0058';
		char letY = '\u0059';
		char letZ = '\u005A';
		
		char char11 = 'A';
		char char12 = 'B';
		char char13 = 'a';
		char char14 = '1';
		char char15 = '8';
		
		
		System.out.println(char11<char12);
		System.out.println(char13<char11);
		System.out.println(char14<char15);
		
		char ch= 'A';
		if (ch >= '\u0041' && ch <= '\u005A') {
			System.out.println(ch + " is an uppercase letter");
		}
		else if (ch >= 'a' && ch <= 'z') {
			System.out.println(ch +" is a lowercase letter");
			
		}
		else if (ch >= '0' && ch <= '9') {
			System.out.println(ch +" is a number");
		}
		else {
			System.out.println("Unknown");
		}
			
				
		
		System.out.println(char1+""+char2+""+char3+""+char4+""+char5);
		//each character stores 4 bits
		System.out.println(num0+""+num1+""+num2+""+num3+""+num4+""+num5+""+num6+""+num7+""
				+num8+""+num9);
		
	
		System.out.println(letG+""+letO+""+letD+" "+letS+""+letA+""+letV+""+letE+" "+
		letT+""+letH+""+letE+" "+letQ+""+letU+""+letE+""+letE+""+letN);
		
		char x = input.next().charAt(0);
		//very important to your code, will be used in assignments
		
		System.out.println("isDigit('a') is " + Character.isDigit('a'));
		System.out.println("isLetter('a') is " + Character.isLetter('a'));
		System.out.println("toLowerCase('A') is " + Character.toLowerCase('A'));
		/*predefined method: methods that the computer already knows. Ex: toLowerCase 
		 * Character.isDigit, etc.
		 */
		
	

	}

}
