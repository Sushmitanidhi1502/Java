package javassignment;
//3
import java.util.Scanner;
public class FahrenheitToCelsius {
	public static void main(String args[]) {
		float f,celsius;
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the degree in Fahrenheit : ");
		f=s.nextFloat();
		celsius=((f-32)*5)/9;
		System.out.println("Temperature from fahrenheit to Celsius : "+celsius);
	}

}
