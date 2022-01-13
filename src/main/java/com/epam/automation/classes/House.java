package com.epam.automation.classes;

public class House {
    private int id;
    private int flatNumber;
    private String street;

    public class ExtraHouseInformation {
        private double flatSquare;
        private int floor;
        private int roomsAmount;
        private String buildingType;
        private int periodOfExploitation;
    }

    ExtraHouseInformation extraHouseInformation = new ExtraHouseInformation();

    public House(int id, int flatNumber, int roomsAmount, double square, int floor) {
        this.id = id;
        this.flatNumber = flatNumber;
        extraHouseInformation.roomsAmount = roomsAmount;
        extraHouseInformation.flatSquare = square;
        extraHouseInformation.floor = floor;
    }

    public House(int id, int flatNumber, int floor, int roomsAmount) {
        this.id = id;
        this.flatNumber = flatNumber;
        extraHouseInformation.floor = floor;
        extraHouseInformation.roomsAmount = roomsAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(int flatNumber) {
        this.flatNumber = flatNumber;
    }

    public double getSquare() {
        return extraHouseInformation.flatSquare;
    }

    public void setSquare(double square) {
        extraHouseInformation.flatSquare = square;
    }

    public int getFloor() {
        return extraHouseInformation.floor;
    }

    public void setFloor(int floor) {
        extraHouseInformation.floor = floor;
    }

    public int getRoomsAmount() {
        return extraHouseInformation.roomsAmount;
    }

    public void setRoomsAmount(int roomsAmount) {
        extraHouseInformation.roomsAmount = roomsAmount;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuildingType() {
        return extraHouseInformation.buildingType;
    }

    public void setBuildingType(String buildingType) {
        extraHouseInformation.buildingType = buildingType;
    }

    public int getPeriodOfExploitation() {
        return extraHouseInformation.periodOfExploitation;
    }

    public void setPeriodOfExploitation(int periodOfExploitation) {
        extraHouseInformation.periodOfExploitation = periodOfExploitation;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", flat=" + flatNumber +
                ", square=" + extraHouseInformation.flatSquare +
                ", floor=" + extraHouseInformation.floor +
                ", roomsAmount=" + extraHouseInformation.roomsAmount +
                ", street='" + street + '\'' +
                ", buildingType='" + extraHouseInformation.buildingType + '\'' +
                ", periodOfExploitation=" + extraHouseInformation.periodOfExploitation +
                '}';
    }
}