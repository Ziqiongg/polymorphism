package _1_polymorphism.Main;

import java.util.ArrayList;

public abstract class Car extends CarPark{

    private String name;
    private String colour;
    private char size;



    public Car(String carName, String carColour, char carSize){
        this.name = carName;
        this.colour = carColour;
        this.size = carSize;

    }


    public abstract boolean canMove();

    public abstract String engine();

    public String makeNoise(){
        return "BEEP BEEP!";
    }






}
