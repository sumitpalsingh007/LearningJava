package helloworldconsulting;

public class ManualTransmissionCar extends Car implements Transmittable{

    public ManualTransmissionCar(String colorInput, String model, int year){
        // first line of a constuctor should call the super constructor
        //super(colorInput, model, year);
    }

    public void setUpGear(){
        System.out.println("stepping up gear");
    }

    public void setUpGear(int currentGear){
        currentGear++;
        System.out.println("stepping up gear to :" + currentGear);
    }

    public void setUpGear(int currentGear, int maxGear){
        if(currentGear < maxGear) {
            currentGear++;
            System.out.println("stepping up gear to :" + currentGear);
        } else {
            System.out.println("step up not possible");
        }
    }


    public void setDownGear(){
        System.out.println("stepping down gear");
    }

    public void transmitt(){
        System.out.println("managing transmission");
    }

    void drive(){
        System.out.println("driving using manual transmission.........");
    }
}
