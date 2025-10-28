package ua.com.kisit.unit9.composition;

public class Car {

    Engine engine;

    public Car() {
        this.engine = new Engine(1L, "name");
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
