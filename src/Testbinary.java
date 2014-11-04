
import java.util.Scanner;

public class Testbinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner(System.in);
		String binary;
		int decimalNumber;

		System.out.print("Enter a binary number --->: ");
		binary = userInput.nextLine();

		decimalNumber = BinaryToDecimalConverter(binary);

		System.out.printf("The decimal number of %s is %d",binary,decimalNumber);
	}

	public static int BinaryToDecimalConverter(String Binarynumber){

		String binary = Binarynumber;
		int nextPowerOfTwo = 1;
		int currentPowerofTwo = 1;
		int decimalNumber = 0; 

		for (int i = binary.length()-1; i>=0;i--){

			if (binary.charAt(i) =='1')
			{
				currentPowerofTwo = nextPowerOfTwo;
				decimalNumber += currentPowerofTwo;
				nextPowerOfTwo *= 2; 
			}
			else{ 
				decimalNumber += 0;
				nextPowerOfTwo *= 2;
			}
		}
		return decimalNumber;
	}

}
