package Assignment3;

class Calculator {
	int add(int a, int b) {
    	return a + b;
    	}

    double add(double a, double b) {
    	return a + b;
    	}
}

public class Q4_MethodOverloading {

	public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(15, 12));
        System.out.println(c.add(12.5, 2.3));
    }

}
