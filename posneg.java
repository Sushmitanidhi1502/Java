import java.util.Scanner;
public class posneg {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number = ");
		int number=s.nextInt();
		if(number>0) {
			System.out.println(+number+ "The number is positive ");
		}
		else if(number<0) {
			System.out.println(+number+ "The number is negative ");
		}
		else {
			System.out.println(+number+ "The number is Zero");
		}
	}

}

