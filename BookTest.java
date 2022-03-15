package javassignment;
//Q18
import java.util.Scanner;
public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book[] = new Book[13];
		book[1] = new Book("Two States","2345","Chetan Bhagat","Jaya Publishers");
		book[2]=new Book("Death-An Inside Story","5562","Sadguru","Sadguru Publishers");
        book[1].getBookInfo();
	}
}
