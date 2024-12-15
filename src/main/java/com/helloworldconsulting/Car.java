package helloworldconsulting;

public abstract class Car {
    private String color;
    private String model;
    private int year;

    /*public Car(String colorInput, String model, int year) {
        this.color = colorInput;
        this.model = model;
        this.year = year;
    }

    public Car(String colorInput, String model) {
        this.color = colorInput;
        this.model = model;
    }*/

    void displayInfo() {
        System.out.println("Model: " + model + ", Color: " + color + ", Year: " + year);
    }

    abstract void drive();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
