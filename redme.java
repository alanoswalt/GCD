# GCD
import java.util.Scanner;

public class gcd 
{
	private static Scanner input;
	public static void main(String[] args)
	{
		int numero1;
		int numero2;
		int divisor;
		input = new Scanner (System.in);
		
		System.out.print("Enter your first number ");
		numero1 = input.nextInt();
		System.out.print("Enter your second number ");
		numero2 = input.nextInt();
		
		if(numero1 > numero2)
			divisor = numero2;
		else
			divisor = numero1;
		while((numero1 % divisor != 0)||(numero2 % divisor != 0))
		{
			divisor--;
		}//end of while
		System.out.printf("The GCD fot %d and %d is %d", numero1, numero2, divisor);
	}//end of main
}//end of class
