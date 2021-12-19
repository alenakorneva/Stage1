package com.epam.automation.collections.homeElectricalAppliances;

import java.util.*;

public class AppliancesCreation {
    ArrayList<ElectricalAppliance> electricalAppliances = new ArrayList<>();

    {
        electricalAppliances.add(new HallAppliance("iron", false, 20.1));
        electricalAppliances.add(new KitchenAppliance("cooker", true, 50.4));
        electricalAppliances.add(new KitchenAppliance("kettle", true, 10.3));
        electricalAppliances.add(new CabinetAppliance("laptop", false, 25.9));
        electricalAppliances.add(new BathroomAppliance("hairdryer", false, 20.1));
        electricalAppliances.add(new HallAppliance("TV", true, 30.7));
        electricalAppliances.add(new KitchenAppliance("multicooker", true, 15.1));
        electricalAppliances.add(new KitchenAppliance("coffeeMachine", true, 43.9));
    }

    public double countTotalPowerConsumption() {
        double totalConsumption = 0.0;
        for (ElectricalAppliance electricalAppliance : electricalAppliances) {
            totalConsumption += electricalAppliance.getPowerConsumption();
        }
        return totalConsumption;
    }

    public double countPowerConsumptionOfPluggedInAppliances() {
        double pluggedInAppliancesConsumption = 0.0;
        for (ElectricalAppliance electricalAppliance : electricalAppliances) {
            if (electricalAppliance.isPluggedIn())
                pluggedInAppliancesConsumption += electricalAppliance.getPowerConsumption();
        }
        return pluggedInAppliancesConsumption;
    }

    public void sortByPower() {
        Comparator<ElectricalAppliance> comparator = (firstElectricalAppliance, secondElectricalAppliance) -> {
            if (firstElectricalAppliance.getPowerConsumption() > secondElectricalAppliance.getPowerConsumption())
                return 0;
            else return -1;
        };
        Collections.sort(electricalAppliances, comparator);
        for (ElectricalAppliance electricalAppliance : electricalAppliances) {
            System.out.println(electricalAppliance.getNameOfTheAppliance() + " " + electricalAppliance.getPowerConsumption());
        }
    }

    public void findPluggedInKitchenApplianceByPower(double powerConsumption, boolean isPluggedIn) {
        for (ElectricalAppliance electricalAppliance : electricalAppliances) {
            if (electricalAppliance.isPluggedIn() == isPluggedIn && electricalAppliance.getPowerConsumption() <= powerConsumption && electricalAppliance instanceof KitchenAppliance)
                System.out.print(electricalAppliance.getNameOfTheAppliance() + " ");
        }
    }
}
