package com.epam.automation.collections.homeElectricalAppliances;

import java.util.*;

public class AppliancesCreation {
    ArrayList<ElectricalAppliances> electricalAppliances = new ArrayList<>();

    public void createAppliances() {
        electricalAppliances.add(new ElectricalAppliances("iron", false, 20.1));
        electricalAppliances.add(new ElectricalAppliances("cooker", true, 50.4));
        electricalAppliances.add(new ElectricalAppliances("kettle", true, 10.3));
        electricalAppliances.add(new ElectricalAppliances("laptop", false, 25.9));
        electricalAppliances.add(new ElectricalAppliances("hairdryer", false, 20.1));
        electricalAppliances.add(new ElectricalAppliances("TV", true, 30.7));
        electricalAppliances.add(new ElectricalAppliances("multicooker", true, 15.1));
        electricalAppliances.add(new ElectricalAppliances("coffeeMachine", true, 43.9));
    }

    public double countTotalPowerConsumption() {
        double totalConsumption = 0.0;
        for (ElectricalAppliances electricalAppliance : electricalAppliances) {
            totalConsumption += electricalAppliance.getPowerConsumption();
        }
        return totalConsumption;
    }

    public double countPowerConsumptionOfPluggedInAppliances() {
        double pluggedInAppliancesConsumption = 0.0;
        for (ElectricalAppliances electricalAppliance : electricalAppliances) {
            if (electricalAppliance.isPluggedIn())
                pluggedInAppliancesConsumption += electricalAppliance.getPowerConsumption();
        }
        return pluggedInAppliancesConsumption;
    }

    public void sortByPower() {
        TreeSet<Double> powerConsumption = new TreeSet<>();
        for (ElectricalAppliances electricalAppliance : electricalAppliances) {
            powerConsumption.add(electricalAppliance.getPowerConsumption());
        }
        System.out.println(powerConsumption);
    }

    public void findPluggedInApplianceByPower(double powerConsumption, boolean isPluggedIn) {
        for (ElectricalAppliances electricalAppliance : electricalAppliances) {
            if (electricalAppliance.isPluggedIn() == isPluggedIn && electricalAppliance.getPowerConsumption() <= powerConsumption)
                System.out.print(electricalAppliance.getNameOfTheAppliance() + " ");
        }
    }
}
