package com.ps;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean isDirty;


    public Room(int numberOfBeds, double price, boolean occupied, boolean isDirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.isDirty = isDirty;
    }
   //Pure getters and setters
    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }
    //Derived getter for isAvailable:

    public  boolean isAvailable(){
        return !occupied & !isDirty;
    }

    //check in/check out/ cleanRoom

    public void checkIn(){
        if(isAvailable()){
            occupied = true;
            isDirty = true;
        }else{
            System.out.println("The room is already occupied");
        }
    }
    //-----------------
    public void checkOut(){
        if(occupied){
            occupied = false;
            isDirty = true;

        }else{
            System.out.println("The room is vacant");
        }
    }

    //// Only allow check-in if the room is both NOT occupied AND NOT dirty
    //You don’t need isAvailable() here because you're not deciding whether someone
    // can check in — you're just checking if someone is currently in the room.
}
