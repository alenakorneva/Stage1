package com.epam.automation.classes;

public class MainClass {
    public static void main (String[] args){
        HouseList houseList = new HouseList();
        houseList.getFlatsByRoomsAmount(2);
        houseList.getFlatsByRoomsAmountAndFloor(2, 3, 7);
        houseList.getFlatBySquare(45.0);
    }

}
