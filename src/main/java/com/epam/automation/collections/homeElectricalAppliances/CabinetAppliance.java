package com.epam.automation.collections.homeElectricalAppliances;

public class CabinetAppliance extends ElectricalAppliance {

    public CabinetAppliance(String nameOfTheAppliance, boolean isPluggedIn, double powerConsumption) {
        super();
    }

    @Override
    public String getApplianceLocation(){
        return "The appliance is located in the cabinet";
    }
}
