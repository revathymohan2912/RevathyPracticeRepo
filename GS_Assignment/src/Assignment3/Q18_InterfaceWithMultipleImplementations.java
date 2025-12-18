package Assignment3;

interface Transport{
	public void booking();
}
class Bus implements Transport{
	public void booking() {
		System.out.println("Bus");
	}
}
class Flight implements Transport{
	public void booking() {
		System.out.println("Flight");
	}
}
public class Q18_InterfaceWithMultipleImplementations {

	public static void main(String[] args) {
		Transport obj = new Bus();
		obj.booking();
		obj = new Flight();
		obj.booking();
	}

}
