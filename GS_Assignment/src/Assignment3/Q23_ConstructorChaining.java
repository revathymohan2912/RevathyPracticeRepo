package Assignment3;

class Mall{
	Mall(){
		System.out.println("Welcome to Mall");
	}
	Mall(int postalCode){
		this();
		System.out.println("Postal Code: "+postalCode);
	}
}
public class Q23_ConstructorChaining {

	public static void main(String[] args) {
		Mall obj = new Mall(690);
	}

}
