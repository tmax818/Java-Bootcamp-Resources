package Code.section16;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Car {

    private String make;
    private double price;
    private int year;
    private String color;
    private String[] parts;

    public Car(String make, double price, int year, String color, String[] parts) {
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
        this.parts = parts;
    }
    

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public String[] getParts() {
        return this.parts;
    }

    public void setParts(String[] parts) {
        this.parts = parts;
    }


    @Override
    public String toString() {
        return "{" +
            " make='" + getMake() + "'" +
            ", price='" + getPrice() + "'" +
            ", year='" + getYear() + "'" +
            ", color='" + getColor() + "'" +
            ", parts='" + getParts() + "'" + Arrays.toString(parts) + 
            "}";
    }

    

    public void drive(){
        System.out.printf("You bought the beautiful %d %s for $ %.2f\n ", this.year, this.make, this.price);
    }


}
