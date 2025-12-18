package Assignment3;

class Devices{
	public void start() {
		System.out.println("Device");
	}
}
class Mobile extends Devices{
	public void calling() {
		System.out.println("Mobile");
	}
}
class SmartPhone extends Mobile{
	public void internet() {
		System.out.println("Smart Phone");
	}
}
public class Q13_MultilevelInheritance {

	public static void main(String[] args) {
		SmartPhone obj = new SmartPhone();
		obj.start();
		obj.calling();
		obj.internet();
		
	}

}
