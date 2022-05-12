package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Shark shark= new Shark();
        Turtle turtle=new Turtle();
        Eagle eagle=new Eagle();

        Animal[] animal=new Animal[3];


        animal[0]=shark;
        animal[1]=turtle;
        animal[2]=eagle;




        for (int i = 0; i < animal.length; i++) {
            if (animal[i] instanceof Eagle){
                System.out.print(animal[i]+" is inheritance of Animal and "+animal[i]);
                ((Eagle) animal[i]).fly();
                System.out.println(animal[i].getClass());
            }
            else if (animal[i] instanceof Shark){
                System.out.print(animal[i]+" is inheritance of Animal and "+animal[i]);
                ((Shark) animal[i]).attack();
                System.out.println(animal[i].getClass());
            }
            else if (animal[i] instanceof Turtle) {
                System.out.print(animal[i] + " is inheritance of Animal and " + animal[i]);
                ((Turtle) animal[i]).swim();
                System.out.println(animal[i].getClass());
            }
        }
    }
}
    
