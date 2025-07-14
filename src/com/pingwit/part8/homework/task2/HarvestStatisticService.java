package com.pingwit.part8.homework.task2;

import java.math.BigDecimal;

public class HarvestStatisticService {
    public HarvestStatistic[] calculate(Harvest[] harvests) {
        if (harvests == null || harvests.length == 0) {
            return new HarvestStatistic[0];
        }

        HarvestStatistic[] temp = new HarvestStatistic[harvests.length];
        int uniqueCount = 0;

        for (Harvest harvest : harvests) {
            if (harvest != null) {
                String currentPlant = harvest.getPlant();
                BigDecimal harvestWeight = harvest.getWeight();

                boolean found = false;

                for (int i = 0; i < uniqueCount; i++) {
                    HarvestStatistic current = temp[i];
                    if (current.getPlant().equals(currentPlant)) { // current и currentPlant очень близкие названия и это путает. Как насчет current -> groupedPlant, plantStatistic, countedPlant?
                        current.setTotalWeight(current.getTotalWeight().add(harvestWeight));
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    temp[uniqueCount++] = new HarvestStatistic(currentPlant, harvestWeight);
                }
            }
        }
        HarvestStatistic[] totalWeightPerPlant = new HarvestStatistic[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) { // попробуй заменить цикл с копированием на вызов метода System.arrayCopy()
            totalWeightPerPlant[i] = temp[i];
        }
        return totalWeightPerPlant;
    }
}
