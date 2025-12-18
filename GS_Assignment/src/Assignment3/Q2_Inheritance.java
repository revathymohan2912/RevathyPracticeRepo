package Assignment3;
//2. Inheritance + Method Overriding

class Vehicle {
    void fuelType() {
        System.out.println("Runs on fuel");
    }
}

class ElectricCar extends Vehicle {
    void fuelType() {
        System.out.println("Runs on electricity");
    }
}


public class Q2_Inheritance {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.fuelType();

        ElectricCar e = new ElectricCar();
        e.fuelType();
    }
}
