package java12;

public class Logical1 {

	
		  public static void main(String[] args) {

		    // && operator
		    System.out.println((5 > 3) && (8 > 5));  
		    System.out.println((5 > 3) && (8 < 5));  

		    // || operator
		    System.out.println((5 < 3) || (8 > 5));  
		    System.out.println(5 > 3);  // true
		    System.out.println((5 < 3) || (8 < 5));  

		    // ! operator
		    System.out.println(!(5 == 3));  
		    System.out.println(!(5 > 3));  
		  }
		}

