package ailsaMensinger;

import java.util.Scanner;

/*
 * Ailsa Mensinger
 * 11-9-18
 */

public class BirthdayProject {

	public static void main(String[] args) {
		//get up scanner
		Scanner input = new Scanner(System.in);
		
		//Binary numbers
		final int num128 = 128;
		final int num64 = 64;
		final int num32 = 32;
		final int num16 = 16;
		final int num8 = 8;
		final int num4 = 4;
		final int num2 = 2;
		final int num1 = 1;
		
		//sets of numbers
		String set1 = "";
		String set2 = "";
		String set3 = "";
		String set4 = "";
		String set5 = "";
		String mset1 = "";
		String mset2 = "";
		String mset3 = "";
		String mset4 = "";
		
		
		//input number
		int inputnum=0;
		
		
		//Conversion placeholder
		int whatsLeft;
		
		
		for(int i=0 ;i<31;i++) {
			String biannum = "";
			
			inputnum = inputnum+1;
			
			//Initialize what's left
			whatsLeft = inputnum;
			
			//creating binary number in string format
			if (whatsLeft >= num128) {
				whatsLeft = whatsLeft - num128;
				biannum = biannum+"1";
			}
			else {
				biannum = biannum+"0";
			}
			if (whatsLeft>= num64) {
				whatsLeft = whatsLeft - num64;
				biannum = biannum+"1";
			}
			else {
				biannum = biannum+"0";
			}
			if (whatsLeft>= num32) {
				whatsLeft = whatsLeft - num32;
				biannum = biannum+"1";
			}
			else {
				biannum = biannum+"0";
			}
			if (whatsLeft>= num16) {
				whatsLeft = whatsLeft - num16;
				biannum = biannum+"1";
			}
			else {
				biannum = biannum+"0";
			}
			if (whatsLeft>= num8) {
				whatsLeft = whatsLeft - num8;
				biannum = biannum+"1";
			}
			else {
				biannum = biannum+"0";
			}
			if (whatsLeft>= num4) {
				whatsLeft = whatsLeft - num4;
				biannum = biannum+"1";
			}
			else {
				biannum = biannum+"0";
			}
			if (whatsLeft>= num2) {
				whatsLeft = whatsLeft - num2;
				biannum = biannum+"1";
			}
			else {
				biannum = biannum+"0";
			}
			if (whatsLeft>= num1) {
				whatsLeft = whatsLeft - num1;
				biannum = biannum+"1";
			}
			else {
				biannum = biannum+"0";
			}
			
			
			
			//checking indexing of binary number
			char xnum7 = biannum.charAt(7);
			char xnum6 = biannum.charAt(6);
			char xnum5 = biannum.charAt(5);
			char xnum4 = biannum.charAt(4);
			char xnum3 = biannum.charAt(3);
			char mnum7 = biannum.charAt(7);
			char mnum6 = biannum.charAt(6);
			char mnum5 = biannum.charAt(5);
			char mnum4 = biannum.charAt(4);
			
			//assign to sets
			if (xnum7=='1' ) {
				set1=set1+inputnum+" ";
			}
			if (xnum6=='1' ) {
				set2=set2+inputnum+" ";
			}
			if (xnum5=='1' ) {
				set3=set3+inputnum+" ";
			}
			if (xnum4=='1' ) {
				set4=set4+inputnum+" ";
			}
			if (xnum3=='1' ) {
				set5=set5+inputnum+" ";
			}
			if (mnum7=='1' ) {
				mset1=mset1+inputnum+" ";
			}
			if (mnum6=='1' ) {
				mset2=mset2+inputnum+" ";
			}
			if (mnum5=='1' ) {
				mset3=mset3+inputnum+" ";
			}
			if (mnum4=='1' ) {
				mset4=mset4+inputnum+" ";
			}
			
			
 		}
		int birthday = 0;
		//display
		System.out.println("set1 is: "+set1);
		System.out.println("Is your birthday in this list of numbers? yes/no");
		String answer1 = input.nextLine();
		if (answer1.equals("yes")) {
			birthday = birthday+1;
			}
			
		
		System.out.println("set2 is: "+set2);
		System.out.println("Is your birthday in this list of numbers? yes/no");
		String answer2 = input.nextLine();
		if (answer2.equals("yes")) {
			birthday = birthday+2;
			
		}
		System.out.println("set3 is: "+set3);
		System.out.println("Is your birthday in this list of numbers? yes/no");
		String answer3 = input.nextLine();
		if (answer3.equals("yes")) {
			birthday = birthday+4;
			
		}
		System.out.println("set4 is: "+set4);
		System.out.println("Is your birthday in this list of numbers? yes/no");
		String answer4 = input.nextLine();
		if (answer4.equals("yes")) {
			birthday = birthday+8;
			
		}
		System.out.println("set5 is: "+set5);
		System.out.println("Is your birthday in this list of numbers? yes/no");
		String answer5 = input.nextLine();
		if (answer5.equals("yes")) {
			birthday = birthday+16;
			
		}
		System.out.println("Your birthday is "+ birthday);
		
		if (answer1.equals("no") && answer2.equals("no") && answer3.equals("no") 
				&& answer4.equals("no") && answer5.equals("no")) {
			System.out.println("You are lying, try again");
		}
	}

}
