package JavaProgramingPractice;

import java.util.Scanner;

public class EvenOddDemo {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		int num;
		System.out.print("Enter positive integer number:");
		num=input.nextInt();// int no. will take thats why nextint
		
		if(num%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
		
		

		
	}

}
