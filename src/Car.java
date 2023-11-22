import java.util.Objects;

public class Car {
    private boolean engine;
    private int cylinder;
    private String name;
    private int wheels;

    public Car(int cylinder, String name) {
        this.cylinder = cylinder;
        this.name = name;
        engine = true;
        wheels = 4;
    }

    public void startEngine() {
        System.out.println("The car's engine is starting");
    }

    public void accelerate() {
        System.out.println("The car is accelerating");
    }

    public void brake() {
        System.out.println("The car is braking");
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinder() {
        return cylinder;
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return cylinder == car.cylinder && Objects.equals(name, car.name);
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinder=" + cylinder +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }
}
