package com.epam.automation.collections.homeElectricalAppliances;

public class BathroomAppliance extends ElectricalAppliance {

    public BathroomAppliance(String nameOfTheAppliance, boolean isPluggedIn, double powerConsumption) {
        super();
    }

    @Override
    public String getApplianceLocation() {
        return "The appliance is located in the bathroom";
    }
}
