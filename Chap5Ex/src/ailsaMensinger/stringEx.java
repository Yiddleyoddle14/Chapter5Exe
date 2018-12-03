package ailsaMensinger;

/*
 * Ailsa Mensinger
 * 11-5-18
 */

public class stringEx {

	public static void main(String[] args) {
		
		String s1 = "Welcome to Java";
		String s2 = "Programming is fun";
		String s3 = "Welcome to Java";
		
		//a
		System.out.println("1. "+s1==s2);
		
		//b
		System.out.println("2. "+s2==s3);
		
		//c
		System.out.println("3. "+s1.equals(s2));
		
		//d
		System.out.println("4. "+s1.equals(s3));
		
		//e
		System.out.println("5. "+s1.compareTo(s2));
		
		//f
		System.out.println("6. "+s2.compareTo(s3));
		
		//g
		System.out.println("7. "+s2.compareTo(s2));
		
		//h
		System.out.println("8. "+s1.charAt(0));
		
		//i
		System.out.println("9. "+s1.indexOf('j'));
		
		//j
		System.out.println("10. "+s1.indexOf("to"));
		
		//k
		System.out.println("11. "+s1.lastIndexOf('a'));
		
		//l
		System.out.println("12. "+s1.lastIndexOf("o", 15));
		
		//m
		System.out.println("13. "+s1.length());
		
		//n
		System.out.println("14. "+s1.substring(5));
		
		//o
		System.out.println("15. "+s1.substring(5,11));
		
		//p
		System.out.println("16. "+s1.startsWith("Wel"));
		
		//q
		System.out.println("17. "+s1.endsWith("Java"));
		
		//r
		System.out.println("18. "+s1.toLowerCase());
		
		//s
		System.out.println("19. "+s1.toUpperCase());
		
		//t
		System.out.println("20. "+s1.concat(s2));
		
		//u
		System.out.println("21. "+s1.contains(s2));
		
		//v
		System.out.println("22. "+"\t Wel \t".trim());
		
		

	}

}
