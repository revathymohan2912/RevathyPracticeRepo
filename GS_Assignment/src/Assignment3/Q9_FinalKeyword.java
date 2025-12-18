package Assignment3;

class Bank {
    final String IFSC = "SBIN00236569";

    final void showIFSC() {
        System.out.println("IFSC: " + IFSC);
    }
}

class HDFCBank extends Bank {
	/*void showIFSC() {
		System.out.println(IFSC);
	}*/
}

public class Q9_FinalKeyword {

	public static void main(String[] args) {
		Bank b = new Bank();
		b.showIFSC();
	}

}
