package Assignment3;

class Camera{
	public void capture() {
		System.out.println("Camera");
	}
}
class DSLRCamera extends Camera{
	public void capture() {
		System.out.println("Its a DSLR Camera");
	}
}
public class Q19_Polymorphism_RuntimeUpcasting {

	public static void main(String[] args) {
		Camera obj = new DSLRCamera();
		obj.capture();
	}

}
