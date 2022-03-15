
public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello";
		String s4="hello";
		String s2=new String("hello");
		String s5=new String("hello");
		char ch[]= {'e','v','e','r','y','o','n','e'};
		String s3=new String(ch);
		//System.out.println(s1);
		//System.out.println(s3);
		//System.out.println(s3.equals(s2));
		//System.out.println(s1.equalsIgnoreCase(s2));
		//System.out.println(s1==s2);
		System.out.println(s2==s5);
		System.out.println(s2.compareTo(s1));//s3>s1
	}

}
