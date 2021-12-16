package com.epam.automation.collections.homeElectricalAppliances;

public class MainClass {
    public static void main(String[] args) {
        AppliancesCreation appliancesCreation = new AppliancesCreation();
        appliancesCreation.createAppliances();
        System.out.println(appliancesCreation.countTotalPowerConsumption());
        appliancesCreation.sortByPower();
        appliancesCreation.findPluggedInApplianceByPower(23, true);
    }

}

