package com.epam.automation.collections.homeElectricalAppliances;

public class HallAppliance extends ElectricalAppliance {

    public HallAppliance(String nameOfTheAppliance, boolean isPluggedIn, double powerConsumption) {
        super();
    }

    @Override
    public String getApplianceLocation() {
        return "The appliance is located in the hall";
    }
}
