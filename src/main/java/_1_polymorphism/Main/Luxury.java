package _1_polymorphism.Main;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Luxury extends Car{


    public Luxury(String carName, String carColour, char carSize) {
        super(carName, carColour, carSize);

    }




    public boolean canMove(){
        return true;
    }

    public String engine(){
        return "Electric";
    }

    @Override
    public String toString() {
        return "Luxury{" +
                "carList=" + carList +
                '}';
    }
}
