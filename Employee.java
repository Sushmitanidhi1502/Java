class person
{
	String name="Sushmita";
	private int id;
}
public class Employee extends person {
	int id;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		System.out.println(e1.name);
		System.out.println(e1.id);

	}

}
