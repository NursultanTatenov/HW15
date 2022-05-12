package com.company;

public class Shark extends Animal {

    void attack (){
        System.out.println(" is attacking.");

    }



    @Override
    void eat() {
        super.eat();


    }
    @Override
    public String toString() {
        return "Shark";
    }
}
