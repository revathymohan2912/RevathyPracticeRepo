package Assignment3;

class Library {
    String libraryName;

    Library() {
        System.out.println("Welcome to the Library!");
    }
    void showLocation() {
        System.out.println("This library is located in Mumbai");
    }
}

public class Q11_ClassObjectMethod {
    public static void main(String[] args) {
        Library obj = new Library();
        obj.showLocation();
    }
}
