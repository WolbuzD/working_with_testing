package com.ps;

public class Reservation {
    // Private fields
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;

    // Getter and Setter for roomType
    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    // Getter and Setter for numberOfNights
    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    // Getter and Setter for isWeekend
    public boolean isWeekend() {
        return isWeekend;
    }

    public void setIsWeekend(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    // Derived getter: returns price based on roomType
    public double getPrice() {
        switch (roomType.toLowerCase()) {
            case "king":
                return 139.0;
            case "double":
                return 124.0;
            default:
                return 0.0;
        }
    }

    // Derived getter: calculates reservation total
    public double getReservationTotal() {
        double total = getPrice() * numberOfNights;
        if (isWeekend) {
            total *= 1.1; // Add 10% weekend surcharge
        }
        return total;
    }
}

