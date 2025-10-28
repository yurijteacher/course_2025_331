package ua.com.kisit.unit9.aggregation;


public class Main {

    public static void main(String[] args) {

        Engine engine = new Engine(1L, "asd");

        Car car = new Car(engine);
        car.setEngine(engine);

        Engine engine2 = new Engine(2L, "model 2");

        Engine engine3 = car.getEngine();

        car.setEngine(engine2);


    }
}
