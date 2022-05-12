package com.company;

public class Eagle extends Animal{

    public void fly(){
        System.out.println(" is flying.");

    }

    @Override
    void eat() {
        super.eat();
    }

    @Override
    public String toString() {
        return "Eagle";
    }
}
