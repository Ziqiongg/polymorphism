package _1_polymorphism.Main;

import java.util.ArrayList;

public abstract class CarPark {
    private String name;

    protected ArrayList<Luxury> carList;

    public CarPark(String name){
        this.name = name;
        this.carList = new ArrayList<>();

    }

    public void setCarList(ArrayList<Car> carList){
        this.carList = carList;
    }
    public ArrayList<Luxury> getCarList(){

        return carList;
    }

    public void addCar(){

//     Luxury luxury1   this.carList.add(luxury1);
    }


}
