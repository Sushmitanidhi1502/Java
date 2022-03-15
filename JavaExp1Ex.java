
public class JavaExp1Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	int a=10/0;
        	//int b=10/0;
        	int b[]=new int[5];
        	b[6]=15;
        }
        catch(ArithmeticException a)
        {
        	System.out.println("An Arithmetic Error Occur");
        	System.out.println(a);
        }
        catch(ArrayIndexOutOfBoundsException a)   
        {
        	System.out.println(a); 
        }
	}

}
