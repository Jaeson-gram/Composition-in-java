package com.Relearn;
//"Composition is like a way to make a combination of classes act like a single coherent object." Since we can't inherit from more than one class :)
public class PersonalComputer extends Product{
    private ComputerCase computerCase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public PersonalComputer(String model, String manufacturer, ComputerCase computerCase, Monitor monitor, MotherBoard motherBoard) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    public ComputerCase getComputerCase() {
        return computerCase;
    }

//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public MotherBoard getMotherBoard() {
//        return motherBoard;
//    }

    //Java's Inheritance breaks Encapsulation, because subclasses may need direct access to a parent's state or behaviour
    //this approach is better than just calling the parts classes' methods (monitor.drawPixelAt(x,y,color) for example from any class, as did in the Main
    //So the components' methods are more secure...
    private void drawLogo(){
        monitor.drawPixelAt(1200, 50, "firebrick");
    }

    public void setBrightness(String intencityPercentage){
        monitor.setResolution("brightness = %" + intencityPercentage);
        System.out.println(monitor.getResolution());
    }

    public void power(){
        computerCase.pressPowerButting();
        drawLogo();
    }

//    public void getDetails(){
//        computerCase.toString();
//        motherBoard.toString();
//        monitor.toString();
//    }

    @Override
    public String toString() {
//        return "PersonalComputer{" +
//                "computerCase=" + computerCase +
//                ", monitor=" + monitor +
//                ", motherBoard=" + motherBoard +
//                "} ";

        return "This PC: \n" +motherBoard.toString() + "\n" +monitor.toString() + "\n" + computerCase.toString();
    }
}
