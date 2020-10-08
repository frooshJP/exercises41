package task1;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Driver driver1 = new Driver("Jens", 27);

        Car car1 = new Car("Tesla", "Roadster", 2020, "2-seater");

        car1.setDriver(driver1);

        System.out.println(car1.toString());
        System.out.println(driver1.toString());

        Car car2 = new Car("Tesla", "Model S", 2019, "Sedan");
        car2.setDriver(driver1);

        System.out.println(car2.toString());
        System.out.println(driver1.toString());

    }
}
