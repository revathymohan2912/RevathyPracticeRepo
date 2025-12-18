package Assignment3;

class Hospital{
	public void emergencyService() {
		System.out.println("Hospital");
	}
}
class CityHospital extends Hospital{
	public void emergencyService() {
		super.emergencyService();
		System.out.println("City Hospital");
	}
}
public class Q16_MethodOverridingWithSuper {

	public static void main(String[] args) {
		CityHospital obj = new CityHospital();
		obj.emergencyService();
	}
}
