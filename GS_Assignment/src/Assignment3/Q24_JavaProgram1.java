package Assignment3;

class Shape1{
	int length;
	public void square() {
		System.out.println("Area of Square = "+(length*length));
	}
	public void rectangle(int breadth) {
		System.out.println("Area of Rectangle = "+(length*breadth));
	}
	public void circle() {
		System.out.println("Area of Circle = "+(3.14*length*length));
	}
}
public class Q24_JavaProgram1 {

	public static void main(String[] args) {
		Shape1 obj = new Shape1();
		obj.length = 10;
		obj.square();
		obj.rectangle(5);
		obj.circle();
	}

}
