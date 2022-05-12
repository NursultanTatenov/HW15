package com.company;

public class Main {

    public static void main(String[] args) {
	
        Shark shark=new Shark();
        Turtle turtle=new Turtle();
        Eagle eagle=new Eagle();

        Animal [] animal=new Animal[3];

        animal[0]=shark;
        animal[1]=turtle;
        animal[2]=eagle;

        for (int i = 0; i < animal.length; i++) {
            if (animal[i] instanceof Animal){
                System.out.println(animal[i]+"inheritance of Animal");
                System.out.println(animal[i].getClass());
            }

        }


        turtle.getClass();


            

        

//
//        for (int i = 0; i < animals.length; i++) {
//
//            if (animals[i] instanceof Animal) {
//
//                System.out.print("");;
                
            }
        }
    
