package javassignment;
import java.util.Scanner;
public class Integers3q7 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		 int num1=0, num2=0, num3, bigger=0, smaller=0;
		 System.out.printf("NUMBER CALCULATIONS\n\n");
		 
		 System.out.printf("Enter First Number:\t\t ");
		 num1=input.nextInt(); 
		 
		 System.out.printf("Enter Second Number:\t ");
		 num2=input.nextInt(); 
		 
		 System.out.printf("Enter Third Number:\t ");
		 num3=input.nextInt();
		 
		 bigger=num1>num2?num1:num2; 
		 bigger=bigger>num3?bigger:num3;
		 smaller=num1<num2?num1:num2;
		 smaller=smaller<num3?smaller:num3; 
		 
		 System.out.printf("\t-------------------------\n");
		 System.out.printf("\t\t\tSum =\t\t %d\n", num1+num2+num3);
		 System.out.printf("\t\t\tAverage =\t %d\n", (num1+num2+num3)/3);
		 System.out.printf("\t\t\tProduct =\t %d\n", num1*num2*num3);
		 System.out.printf("\t\t\tBiggest =\t %d\n", bigger);
		 System.out.printf("\t\t\tSmallest =\t %d\n", smaller);

	}

}
