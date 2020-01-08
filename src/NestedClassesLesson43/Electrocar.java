package NestedClassesLesson43;

public class Electrocar {
    private int id;
    private class Motor{                               //  nested class not static
        public void startMotor(){
            System.out.println("Motor " + id + "is starting");
        }
    }
    public static class Battery{                       // nested static class
        public void charge(){
            System.out.println("Battery is charging");
        }
    }
    public Electrocar(int id){
        this.id = id;
    }
    public void start() {
        Motor motor = new Motor();
        motor.startMotor();
        final int x =1;                               // only constant

        class SomeClass {                             // nested class
            public void someMethod() {
                System.out.println(x);                // only constant
                System.out.println(id);
            }
        }
        SomeClass someObject = new SomeClass();
        test(someObject);

         System.out.println("Electocar " + id + " is starting");
    }
     private void test(Object object){

     }
}
