package Assignment3;

interface Payment {
    void makePayment();
}

class UPI implements Payment {
    public void makePayment() {
        System.out.println("UPI Payment done");
    }
}

class CreditCard implements Payment {
    public void makePayment() {
        System.out.println("Credit Card Payment Done");
    }
}
public class Q6_InterfaceImplementation {
    public static void main(String[] args) {
        Payment obj1 = new UPI();
        obj1.makePayment();
        Payment obj2 = new CreditCard();
        obj2.makePayment();
    }
}

