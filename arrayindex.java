import java.util.Scanner;
public class arrayindex{

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		int[]arr = new int [] {1,2,3,4,5};
		System.out.println("Enter the size of the array : ");
		int n=s.nextInt();
		int ar[]=new int[n];
        System.out.println("Enter array elements ");
		for(int i=0;i<n;i++) {
			ar[i]=s.nextInt();
			System.out.print(arr[i] + " ");
		}
        for(int i=0;i<n;i++) {
        	System.out.println(ar[i]+" "+i);
        }
	}

}
