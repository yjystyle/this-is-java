package ch7.inheritance.abstracts;

public class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("멍멍");
    }
    
}

class Parent{
    public String name;
    Parent(){}
    // Parent(String name){this.name = name;}
}

class child extends Parent {



}