package myfirstprogram;
//Demo for conditional stmts
import java.util.Scanner;

public class DemoConditionalStmts {

	public static void main(String[] args) {
		// local variable
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number");
		 int x=sc.nextInt();
		
		if(x>0) {
		    System.out.println("The given number is positive");
		    }
		else if(x<0){
		    System.out.println("The given number is negative");
		   }

		else {
			System.out.println("The given number is zero");
		}
		}

	}
