package javassignment;
//Q10
import java.util.Scanner;
public class RadiusphereQ10 {
	
		public static double sphereVolume(double radius) { 
			 return (4.0/3.0)* Math.PI * Math.pow (radius,3); 
			 }
			 public static void main(String[] args) { 
			 Scanner input=new Scanner(System.in);
			 double radius=0.0, volume=0.0;
			 
			 System.out.printf("Enter Radius: ");
			 radius=input.nextInt();
			// display the Volume by calling the sphereVolume method
			 System.out.printf("Volume = %.3f", sphereVolume(radius)); 

	}

}
