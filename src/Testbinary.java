
import java.util.Scanner;

public class Testbinary {

	/**
	 * This program prompt a user to enter a binary number and convert it to it 
	 * corresponding decimal value.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		 
	    System.out.print("Enter a binary number --->: ");
	    String binary = in.nextLine();
	      
	    String decimal = " ";
		int product = 1; // Initialize product to 1 power to 1 and result to 0 in order 
						// to process the result
		int power = 1;
		int result = 0; 
		
		// go through the string and process the last binary number
		for (int i = binary.length()-1; i>=0;i--){
			
			if (binary.charAt(i) =='1'){	// if the character is 1 
				result += product;
				product = product *2; // get the power of two 
			}
			else { // else 
				power = 0; // add the zero to the final result
				result += power;
				product = product *2;
				}
			decimal = result + ""; // append the result to be displayed 
		}
		System.out.println(decimal);
	}
	
}
