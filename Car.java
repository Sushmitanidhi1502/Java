package javassignment;
//q19
public class Car {
	int Speed;
	double regularPrice;
	String color;
	public Car (int Speed,double regularPrice,String color) {
	this.Speed = Speed;
	this.regularPrice = regularPrice;
	this.color = color;
	}
	public double getSalesPrice() {
	return regularPrice;
	}

} 
class Truck extends Car{
    int weight;
	public Truck (int Speed,double regularPrice,String color, int weight) {
	super(Speed,regularPrice,color);
	this.weight = weight;
	}
	public double getSalesPrice() {
     return super.getSalesPrice()*(weight>2000 ? 0.10 : 0.20);
	}
}
class Ford extends Car {
	int year;
    int manufacturerDiscount;
	public Ford (int Speed,double regularPrice,String color, int year, int
	manufacturerDiscount) {
	super (Speed,regularPrice,color);
	this.year = year;
	this.manufacturerDiscount = manufacturerDiscount;
	}
	public double getSalePrice() {
	return (super.getSalesPrice() - manufacturerDiscount);
	}

}
class Sedan extends Car {
	int length;
	public Sedan (int Speed,double regularPrice,String color, int length) {
	super (Speed,regularPrice,color);
	this.length = length;
	}
	public double getSalesPrice() {
		return super.getSalesPrice()*(length>20 ?0.05 : 0.10);
	}
}
	
