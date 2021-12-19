package com.epam.automation.collections.homeElectricalAppliances;

public abstract class ElectricalAppliance {

    private String nameOfTheAppliance;
    private boolean isPluggedIn;
    private double powerConsumption;

    public abstract String getApplianceLocation();

    public String getNameOfTheAppliance() {
        return nameOfTheAppliance;
    }

    public void setNameOfTheAppliance(String nameOfTheAppliance) {
        this.nameOfTheAppliance = nameOfTheAppliance;
    }

    public boolean isPluggedIn() {
        return isPluggedIn;
    }

    public void setPluggedIn(boolean pluggedIn) {
        isPluggedIn = pluggedIn;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }


}
