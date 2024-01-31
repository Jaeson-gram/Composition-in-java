package com.Relearn.Challenge;

public class SmartKitchen {

    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen() {
        brewMaster = new CoffeeMaker();
        dishWasher = new DishWasher();
        iceBox = new Refrigerator();
    }

//    public void addWater(){
//        brewMaster.setHasWorkToDo(true);
//    }
//
//    public void pourMilk(){
//        iceBox.setHasWorkToDo(true);
//    }
//
//    public void loadDishWasher(){
//        dishWasher.setHasWorkToDo(true);
//    }

    public CoffeeMaker getBrewMaster() {
//        brewMaster.brewCoffee();
        return brewMaster;
    }

    public DishWasher getDishWasher() {
//        dishWasher.doDishes();
        return dishWasher;
    }

    public Refrigerator getIceBox() {
//        iceBox.orderFood();
        return iceBox;
    }

    //we use this method to set the flags for the hasWorkToDo value for the three classes, so our calling code does not have to go too deep inside the class...
    public void setKitchenState(boolean willBrew, boolean willWashDishes, boolean willMakeIce){
        brewMaster.setHasWorkToDo(willBrew);
        dishWasher.setHasWorkToDo(willWashDishes);
        iceBox.setHasWorkToDo(willMakeIce);
    }

    //This method calls the methods that does the work in all three methods so the calling code does not need so much access...
    public void doKitchenWork(){
        brewMaster.brewCoffee();
        dishWasher.doDishes();
        iceBox.orderFood();
    }

    
}


