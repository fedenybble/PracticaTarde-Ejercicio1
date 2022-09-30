public class Car {

    private String model;
    private String color;
    private int year;
    private int gearBox;


    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public void start(){
        System.out.println("Im Start now");
    }

    public void running(){
        System.out.println("Now im Running, nothing can stop me!");
    }

    public void stop(){
        System.out.println("Ok, im stop, what now?");
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public void getGearBox() {

        System.out.println("Im running with "+gearBox+" Gear now");
    }

    public void setGearBox(int gearBox) {
        this.gearBox = gearBox;
    }
}
