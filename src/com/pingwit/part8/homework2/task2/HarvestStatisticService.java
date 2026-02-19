package com.pingwit.part8.homework2.task2;

import java.math.BigDecimal;

public class HarvestStatisticService {

    public HarvestStatistic[] calculate(Harvest[] harvests) {
        HarvestStatistic[] temp = new HarvestStatistic[harvests.length];
        int uniqueCount = 0;

        for (int i = 0; i < harvests.length; i++) {
            Harvest current = harvests[i];
            boolean found = false;

            for (int j = 0; j < uniqueCount; j++) {
                if (temp[j].getPlant().equals(current.getPlant())) {
                    BigDecimal totalWeight = temp[j].getTotalWeight().add(current.getWeight());
                    temp[j].setTotalWeight(totalWeight);
                    found = true;
                    break;
                }
            }
            if (!found) {
                temp[uniqueCount++] = new HarvestStatistic(current.getPlant(), current.getWeight());
            }
        }
        HarvestStatistic[] totalWeightPerPlant = new HarvestStatistic[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            totalWeightPerPlant[i] = temp[i];
        }
        return totalWeightPerPlant;
    }
}
