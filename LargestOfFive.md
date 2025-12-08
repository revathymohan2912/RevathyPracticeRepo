public class ifElseLadder {

	public static void main(String[] args) {
		int a =20;
		int b=30;
		int c=25;
		int d=45;
		int e =10;
		
		if(a>b && a>c && a>d && a>e) {
			System.out.println("a is max");
		}
		else if (b>a && b>c && b>d && b>e) {
			System.out.println("b is max");
		}
		else if(c>a && c>b && c>d && c>e) {
			System.out.println("c is max");
		}
		else if(d>a && d>b && d>c && d>e) {
			System.out.println("d is max");
		}
		else {
			System.out.println("e is max");
		}
	}

}
