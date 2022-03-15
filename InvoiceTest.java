package javassignment;
//q14
public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoice invoice1=new Invoice ("A5544", "Big Black Book", 500, 250.00);
		 Invoice invoice2=new Invoice ("A5542", "Big Pink Book", 300, 50.00);
		 
		 System.out.printf("Invoice 1: %s\t%s\t%d\t$%.2f\n", invoice1.getPartNum(),
		invoice1.getPartDesc(), invoice1.getQuantity(), invoice1.getPrice());
		 System.out.printf("Invoice 2: %s\t%s\t%d\t$%.2f\n", invoice2.getPartNum(),
		invoice2.getPartDesc(), invoice2.getQuantity(), invoice2.getPrice());

	}

}
