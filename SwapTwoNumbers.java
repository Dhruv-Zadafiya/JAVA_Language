import java.util.Scanner;
public class SwapTwoNumbers{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");   
		int firstNumber = sc.nextInt();              
		System.out.println("Enter the second number: ");
		int secondNumber = sc.nextInt();            
		System.out.println("--BEFORE SWAPPING--");
		System.out.println(firstNumber +" "+ secondNumber);
		int temp = firstNumber;         
		firstNumber = secondNumber;
		secondNumber = temp;
		System.out.println("--AFTER SWAPPING--");
		System.out.println(firstNumber +" "+ secondNumber);
	}
}