package Serialization47;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 3961314650795998919L;   // need add! for serialization
    private   int id;
    private  String name;                    // key word transient -- do not serializable
    private int age;

    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String toString(){
        return id + " : " + name;
    }
}
