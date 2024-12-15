package helloworldconsulting;

public class AutomaticTransmissionCar extends Car implements Transmittable{

    public AutomaticTransmissionCar(String colorInput, String model, int year) {
        //super(colorInput, model, year);
    }

    public void transmitt(){
        System.out.println("no transmission required");
    }

    void drive(){
        System.out.println("driving using automatic transmission.........");
    }
}
