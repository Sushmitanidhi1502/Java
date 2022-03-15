import java.util.Scanner;
public class primeno {

	public static void main(String[] args) {
		int num,x,temp=0,i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number = ");
		num=s.nextInt();
		x=num/2;
		if(num==0||num==1) {
			System.out.println(+num+" It is not a Prime number ");
		}
		else{
			for(i=2;i<=x;i++) {
				if(num%i==0) {
					System.out.println(+num+" Its not a Prime number ");
					temp=1;
					break;
				}
			}
		}
		if(temp==0) {
			System.out.println(+num+" Its a Prime number ");
		}

	}

}
