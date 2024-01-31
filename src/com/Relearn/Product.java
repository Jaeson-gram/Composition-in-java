package com.Relearn;

public class Product {
    private String model;
    private String manufacturer;
    private int width;
    private int height;
    private int depth;

    public Product(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }
}


//CLASSES
class Monitor extends Product{
    private int size;
    private String resolution;

    //Constructors
    public Monitor(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Monitor(String model, String manufacturer, int size, String resolution) {
        super(model, manufacturer);
        this.size = size;
        this.resolution = resolution;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    //Methods
    public void drawPixelAt(int x, int y, String color){
        System.out.printf("drawing pixel at %d,%d in %s%n", x,y,color);
    }



    @Override
    public String toString() {
        return "Monitor{" +
                "size=" + size +
                ", resolution='" + resolution + '\'' +
                "} ";
    }
}

class ComputerCase extends Product{
    private String powerSupply;
    private static boolean isPoweredOn = false;
    private static int poweredOn = 0;
    //Constructors
    public ComputerCase(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public ComputerCase(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer);
        this.powerSupply = powerSupply;
    }

    //Methods
    public void pressPowerButting(){
        if (isPoweredOn){
            System.out.printf("Starting...%n");
            isPoweredOn = true;
        }

        else {
            System.out.printf("Power button pressed! %nShutting down...");
            isPoweredOn = false;
        }

    }

    @Override
    public String toString() {
        return "ComputerCase{" +
                "powerSupply='" + powerSupply + '\'' +
                "} ";
    }
}

class MotherBoard extends Product{
    private int ramSlots;
    private int cardSlot;
    private String bios;

    //Constructors
    public MotherBoard(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public MotherBoard(String model, String manufacturer, int ramSlots, int cardSlot, String bios) {
        super(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlot = cardSlot;
        this.bios = bios;
    }

    //Methods...
    public void loadProgram(String programName){
        System.out.println("Program " + programName + " loading...");
    }

    @Override
    public String toString() {
        return "MotherBoard{" +
                "ramSlots=" + ramSlots +
                ", cardSlot=" + cardSlot +
                ", bios='" + bios + '\'' +
                "} " ;
    }
}
