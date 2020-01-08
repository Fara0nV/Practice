package NestedClassesLesson43;

public class TestingOfCar {
    public static void main(String[] args) {
        Electrocar electrocar = new Electrocar(1);
        electrocar.start();
        Electrocar.Battery battery = new Electrocar.Battery();
    }
}
