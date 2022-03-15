import java.util.Scanner;
public class blooddonate {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your age = ");
		int age =s.nextInt();
		System.out.println("Enter your weight = ");
		int weight =s.nextInt();
		if(age>=18 && weight>=40) {
			System.out.println("ELIGIBLE to donate blood");
		}
		else {
			System.out.println("NOT ELIGIBLE to donate blood");
		}

	}

}
