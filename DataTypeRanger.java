import java.lang.Math;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter number of bits your data type takes : ");
		
		int bits=s.nextInt();
		// give range of data types
		
		// Math.pow(base,number of bits)
		int a = (int)Math.pow(2,bits);
		
		int max = (a/2) -1;
		System.out.println("Maximum value that given data type can hold =  " + max);
		int min = -( max + 1);
		System.out.println("Minimum value that given data type can take = "+ min);
	}
}