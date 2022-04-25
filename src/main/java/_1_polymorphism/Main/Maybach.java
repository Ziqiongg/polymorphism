package _1_polymorphism.Main;

class Maybach extends Luxury {

    public Maybach(String carName, String carColour, char carSize) {
        super(carName, carColour, carSize);
    }

    @Override
    public String makeNoise(){
        return "Beep Beep!";
    }


}
