
public class crtobj {
	int id=55;
	String name;
	int phonenumber;
	void getValues(int i, String n ,int num) {
		id=i;
		name=n;
		phonenumber=num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		crtobj e1=new crtobj();
		//System.out.println(e1.id);
		e1.getValues(10, "KOMAL", 620113487);

	}

}
