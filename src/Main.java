public class Main {
    public static void main(String[] args) {
        Car car = new Car("GTR3S","Porsche",2021,730000,"Red",3);
        System.out.println(car.toString());
        car.delivery();
        System.out.println(car.toString());
        car.sell();
        System.out.println(car.toString());
        car.setModel("Accord");
        car.setYear(2020);
        car.setColor("Blue");
        System.out.println(car.toString());

    }
}