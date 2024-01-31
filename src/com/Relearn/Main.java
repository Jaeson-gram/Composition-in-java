package com.Relearn;
import com.Relearn.Challenge.SmartKitchen;


public class Main {

    public static void main(String[] args) {
	// write your code here
        //The case
        ComputerCase theCase = new ComputerCase("2208", "Dell", "240V");
        //The monitor
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, "2540 x 1440");
        //the motherboard
        MotherBoard theMotherBoard = new MotherBoard("BJ-200", "Asus", 4, 6, "v2-44");

        //Now the Personal Computer
        PersonalComputer thePC = new PersonalComputer("2208", "Dell", theCase, theMonitor, theMotherBoard);

        System.out.println(thePC);
        System.out.println();

//        thePC.getMonitor().drawPixelAt(10, 10, "orange");
//        thePC.getMotherBoard().loadProgram("Jera OS");
//        thePC.getComputerCase().pressPowerButting();

        thePC.power();
        thePC.setBrightness("75");
        System.out.println();

        //CHALLENGE:
        System.out.println("SMART-KITCHEN CHALLENGE");
        System.out.println("*************************");

        SmartKitchen kitchen = new SmartKitchen();

//        kitchen.getDishWasher().setHasWorkToDo(true);
//        kitchen.getIceBox().setHasWorkToDo(true);
//        kitchen.getBrewMaster().setHasWorkToDo(true);

        kitchen.setKitchenState(true, false, true);
    //  -> we use this method to set the flags for the hasWorkToDo value for the three classes, so our calling code does not have to go too deep inside the class like above...


//        kitchen.getDishWasher().doDishes();
//        kitchen.getIceBox().orderFood();
//        kitchen.getBrewMaster().brewCoffee();

        kitchen.doKitchenWork();
    //  -> This method calls the methods that does the work in all three methods so the calling code does not need so much access like above...

    }

}
