package javassignment;
//q2
import java.util.Scanner;
public class productofIntegers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int product=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of your choice : \n");
		int x=s.nextInt();
      	int y=s.nextInt();
		int z=s.nextInt();
		product=x*y*z;
		System.out.println("The product of integers is : "+product);

	}

}
