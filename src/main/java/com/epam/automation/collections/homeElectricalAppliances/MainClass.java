package com.epam.automation.collections.homeElectricalAppliances;

public class MainClass {
    public static void main(String[] args) {
        AppliancesCreation appliancesCreation = new AppliancesCreation();
        System.out.println(appliancesCreation.getTotalPowerConsumption());
        appliancesCreation.sortByPower();
        System.out.println(appliancesCreation.findPluggedInKitchenApplianceByPower(23, true));
    }

}

