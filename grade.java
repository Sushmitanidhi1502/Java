
public class grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=65;
		if(marks>=75) {
			System.out.println("Your total marks are = "+marks+"\n Your result is A grade");
		}
		else if(marks>60 && marks<75) {
			System.out.println("Your total marks are = "+marks+"\n Your result is B grade");
		}
		else if(marks>50 && marks<60) {
			System.out.println("Your total marks are = "+marks+"\n Your result is C grade");
		}
		else if(marks>40 && marks<50) {
			System.out.println("Your total marks are = "+marks+"\n Your result is D grade");
			
		}
		else {
			System.out.println("Your total marks are = "+marks+"\n Your result is FAIL");
		}

	}

}
