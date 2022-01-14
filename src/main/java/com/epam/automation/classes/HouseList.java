package com.epam.automation.classes;

import java.util.ArrayList;

public class HouseList {
    protected ArrayList<House> houses = new ArrayList<>();

    {
        houses.add(new House(1, 111, 3, 35.6, 3));
        houses.add(new House(2, 222, 2, 43.5, 4));
        houses.add(new House(3, 333, 1, 55.8, 5));
        houses.add(new House(4, 444, 2, 110.4, 6));
        houses.add(new House(5, 555, 3, 65.3, 7));
        houses.add(new House(6, 666, 2, 74.3, 5));
        houses.add(new House(7, 777, 1, 40.7, 23));
        houses.add(new House(8, 888, 2, 96.7, 1));
    }

    public int getFlatsByRoomsAmount(int roomsAmount) {
        System.out.println("Flats with rooms amount: " + roomsAmount);
        int flatNumberWIthRequiredRoomsAmount = 0;
        for (House house : houses) {
            if (house.getRoomsAmount() == roomsAmount)
                flatNumberWIthRequiredRoomsAmount = house.getFlatNumber();
        }
        return flatNumberWIthRequiredRoomsAmount;
    }

    public int getFlatsByRoomsAmountAndFloor(int roomsAmount, int initialFloor, int endFloor) {
        System.out.println("Flats with rooms amount: " + roomsAmount + " on the floor between " + initialFloor + " and " + endFloor);
        int flatNumberWIthRequiredRoomsAmountAndFloor = 0;
        for (House house : houses) {
            if (house.getRoomsAmount() == roomsAmount && house.getFloor() >= initialFloor && house.getFloor() <= endFloor)
                flatNumberWIthRequiredRoomsAmountAndFloor = house.getFlatNumber();
        }
        return flatNumberWIthRequiredRoomsAmountAndFloor;
    }

    public int getFlatBySquare(double square) {
        System.out.println("Flats with square more than " + square + " square meters");
        int flatNumberWIthRequiredSquare = 0;
        for (House house : houses) {
            if (house.getSquare() > square)
                flatNumberWIthRequiredSquare = house.getFlatNumber();
        }
        return flatNumberWIthRequiredSquare;
    }
}
