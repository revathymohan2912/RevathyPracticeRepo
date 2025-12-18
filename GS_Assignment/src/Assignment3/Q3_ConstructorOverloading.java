package Assignment3;

class Product {
    int productId;
    String productName;
    double price;

    Product() {
        System.out.println("Product Created");
    }

    Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    void displayProduct() {
        System.out.println("Product ID: "+productId);
        System.out.println("Name: "+productName);
        System.out.println("Price: "+price);
        }
}

public class Q3_ConstructorOverloading {

	public static void main(String[] args) {
		Product p1 = new Product();

        Product p2 = new Product(0101, "Laptop", 65000);
        p2.displayProduct();
    }
}