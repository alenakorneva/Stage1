package com.epam.automation.collections.homeElectricalAppliances;

public class HallAppliance extends ElectricalAppliance {

    private String nameOfTheAppliance;
    private boolean isPluggedIn;
    private double powerConsumption;

    public HallAppliance(String nameOfTheAppliance, boolean isPluggedIn, double powerConsumption) {
        this.nameOfTheAppliance = nameOfTheAppliance;
        this.isPluggedIn = isPluggedIn;
        this.powerConsumption = powerConsumption;
    }

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

    @Override
    public String toString() {
        return "HallAppliance{" +
                "nameOfTheAppliance='" + nameOfTheAppliance + '\'' +
                ", isPluggedIn=" + isPluggedIn +
                ", powerConsumption=" + powerConsumption +
                '}';
    }

    @Override
    public String getApplianceLocation() {
        return "The appliance is located in the hall";
    }
}
