package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room(int numberOfBeds, double price) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = false;
        this.isDirty = false;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        return !isOccupied && !isDirty;
    }

    public void checkIn() {
        isOccupied = true;
        isDirty = true;
        System.out.println("Room is being checked in.");
    }

    public void checkout() {
        isCleanroom();
        System.out.println("Room is being checked out and getting clean then will be available.");
    }

    public void isCleanroom() {
        isAvailable();
    }
}