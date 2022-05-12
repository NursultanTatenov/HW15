package com.company;

public class Turtle extends Animal{


    public void swim (){
        System.out.println(" swimming. ");

    }
    @Override
    void eat() {
        super.eat();
    }

    @Override
    public String toString() {
        return "Turtle";
    }
}
