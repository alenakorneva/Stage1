package com.epam.automation.collections.homeElectricalAppliances;

public class KitchenAppliance extends ElectricalAppliance {

    public KitchenAppliance(String nameOfTheAppliance, boolean isPluggedIn, double powerConsumption) {
        super();
    }

    @Override
    public String getApplianceLocation() {
        return "The appliance is located in the kitchen";
    }
}
