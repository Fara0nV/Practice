package ua.faraon.unit21;

public class KeywordStatic {
    public static void main(String[] args){
    Human h1 = new Human("Bob",23);
    Human h2 = new Human("Tom",56);
    Human h3 = new Human("Jack",32);
    h1.printNumberOfPeople();
    h2.printNumberOfPeople();
    h3.printNumberOfPeople();


    }
}
class Human {
    private String name;
    private int age;
    private static int countPeople;
    public Human(String name, int age) {
        System.out.println("Hello from constructor number 3");
        this.name = name;
        this.age = age;
        countPeople ++;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void printNumberOfPeople(){
        System.out.println("Number of people is " + countPeople);
    }
}
