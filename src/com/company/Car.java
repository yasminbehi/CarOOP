package com.company;

public class Car {

    //Privet member variables

    private String model;
    private String make;
    private int year;
    private String color;
    private int speed;

    // no-argument default constructor
    public Car() {
        setColor("blue");
    }

    // one-arg constructor
    public Car(String color) {
        setColor(color);

    }


    public Car(int year) {
        this.year = year;
    }

    // overload constructor
    public Car(String model, String make, int year, String colo) {

        this.color = color;
        this.model = model;
        this.year = year;
        this.make = make;
    }

    public void setModel(String model) {

        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setMake(String make) {

        this.make = make;
    }

    public String getMake() {
        return make;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {

        return year;
    }

    public void setSpeed(int speed) {

        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }


// additional functions
// methods which return a string indicating each task the car is performing.

    /*
    * The red Porsche is starting
The red Porsche is accelerating
The red Porsche is going 50 mph
The red Porsche is stopped*/

public String start(){
    return " is starting";
}

public String accelerate() {

    return " is accelerating";
}
    public String showSpeed() {
        return " is going" + getSpeed() + "mph";
    }


    public String stop(){

            return " is stopped";

}
}


