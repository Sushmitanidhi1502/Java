import java.util.Arrays;
public class StropUpLowcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello,Welcome,Everyone";
		String s3="welcome";
		String s2=new String("Everyone");
		String[] words=s1.split("\\.");
		System.out.println(s2.length());
		System.out.println(s2[s2.length()]);
		//System.out.println(s1);
		//System.out.println(s1.toUpperCase());
		//System.out.println(s1.toLowerCase());
		System.out.println(words);
       System.out.println(Arrays.toString(words));
	}

}
