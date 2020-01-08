package AnonimousClasses35;


interface AbleToEat{
    public void eat();
}

public class Test {
    public static void main(String[] args) {
        AbleToEat ableToEat = new AbleToEat() {          // anonimous
            @Override                                    // only once
            public void eat() {
                System.out.println("Someone is eating ");
            }
        };
        ableToEat.eat();
    }
}
