package com.epam.automation.classes;

import java.util.ArrayList;

public class HouseList {
    ArrayList<House> houses = new ArrayList<>();

    {
        houses.add(new House(1, 111, 3, 35.6, 3));
        houses.add(new House(1, 222, 2, 43.5, 4));
        houses.add(new House(1, 333, 1, 55.8, 5));
        houses.add(new House(1, 444, 2, 110.4, 6));
        houses.add(new House(1, 555, 3, 65.3, 7));
        houses.add(new House(1, 666, 2, 74.3, 5));
        houses.add(new House(1, 777, 1, 40.7, 23));
        houses.add(new House(1, 888, 2, 96.7, 1));
    }

    public void getFlatsByRoomsAmount(int roomsAmount) {
        System.out.println("Flats with rooms amount: " + roomsAmount);
        for (House house : houses) {
            if (house.getRoomsAmount() == roomsAmount)
                System.out.println(house.getFlat());
        }
    }

    public void getFlatsByRoomsAmountAndFloor(int roomsAmount, int initialFloor, int endFloor) {
        System.out.println("Flats with rooms amount: " + roomsAmount + " on the floor between " + initialFloor + " and " + endFloor);
        for (House house : houses) {
            if (house.getRoomsAmount() == roomsAmount && house.getFloor() >= initialFloor && house.getFloor() <= endFloor)
                System.out.println(house.getFlat());
        }
    }

    public void getFlatBySquare(double square) {
        System.out.println("Flats with square more than " + square + " square meters");
        for (House house : houses) {
            if (house.getSquare() > square)
                System.out.println(house.getFlat());
        }
    }
}
