package com.epam.automation.classes;

import java.util.Objects;

public class House {
    private int id;
    private int flatNumber;
    private double flatSquare;
    private int flatFloor;
    private int roomsAmountItFlat;

    public class ExtraHouseInformation {
        private String street;
        private String buildingType;
        private int periodOfExploitation;
    }

    ExtraHouseInformation extraHouseInformation = new ExtraHouseInformation();

    public House(int id, int flatNumber, int floor, int roomsAmount) {
        this.id = id;
        this.flatNumber = flatNumber;
        flatFloor = floor;
        roomsAmountItFlat = roomsAmount;
    }

    public House(int id, int flatNumber, int roomsAmount, double square, int floor) {
        this(id, flatNumber, roomsAmount, floor);
        flatSquare = square;
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
        return flatSquare;
    }

    public void setSquare(double square) {
        flatSquare = square;
    }

    public int getFloor() {
        return flatFloor;
    }

    public void setFloor(int floor) {
        flatFloor = floor;
    }

    public int getRoomsAmount() {
        return roomsAmountItFlat;
    }

    public void setRoomsAmount(int roomsAmount) {
        roomsAmountItFlat = roomsAmount;
    }

    public String getStreet() {
        return extraHouseInformation.street;
    }

    public void setStreet(String street) {
        extraHouseInformation.street = street;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return id == house.id &&
                flatNumber == house.flatNumber &&
                Double.compare(house.flatSquare, flatSquare) == 0 &&
                flatFloor == house.flatFloor &&
                roomsAmountItFlat == house.roomsAmountItFlat &&
                Objects.equals(extraHouseInformation, house.extraHouseInformation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, flatNumber, flatSquare, flatFloor, roomsAmountItFlat, extraHouseInformation);
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", flatNumber=" + flatNumber +
                ", flatSquare=" + flatSquare +
                ", flatFloor=" + flatFloor +
                ", roomsAmountItFlat=" + roomsAmountItFlat +
                ", extraHouseInformation=" + extraHouseInformation +
                '}';
    }
}