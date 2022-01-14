package com.epam.automation.collections.homeElectricalAppliances;

import java.util.Objects;

public abstract class ElectricalAppliance {

    private String nameOfTheAppliance;
    private boolean isPluggedIn;
    private double powerConsumption;

    public ElectricalAppliance(String nameOfTheAppliance, boolean isPluggedIn, double powerConsumption) {
        this.nameOfTheAppliance = nameOfTheAppliance;
        this.isPluggedIn = isPluggedIn;
        this.powerConsumption = powerConsumption;
    }

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

    @Override
    public String toString() {
        return "ElectricalAppliance{" +
                "nameOfTheAppliance='" + nameOfTheAppliance + '\'' +
                ", isPluggedIn=" + isPluggedIn +
                ", powerConsumption=" + powerConsumption +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ElectricalAppliance that = (ElectricalAppliance) o;
        return isPluggedIn == that.isPluggedIn &&
                Double.compare(that.powerConsumption, powerConsumption) == 0 &&
                Objects.equals(nameOfTheAppliance, that.nameOfTheAppliance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfTheAppliance, isPluggedIn, powerConsumption);
    }
}
