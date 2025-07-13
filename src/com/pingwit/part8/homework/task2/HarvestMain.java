package com.pingwit.part8.homework.task2;

import java.math.BigDecimal;

public class HarvestMain {
    public static void main(String[] args) {
        Harvest[] harvests = {
                new Harvest(101L, "Field 1", "Apple", BigDecimal.valueOf(101.5)),
                new Harvest(102L, "Field 2", "Potato", BigDecimal.valueOf(205.5)),
                new Harvest(103L, "Field 4", "Strawberry", BigDecimal.valueOf(50.5)),
                new Harvest(104L, "Field 3", "Cucumber", BigDecimal.valueOf(100.5)),
                new Harvest(105L, "Field 3", "Cucumber", BigDecimal.valueOf(168.0)),
        };
        HarvestStatisticService harvestStatisticService = new HarvestStatisticService();
        HarvestStatistic[] statistics = harvestStatisticService.calculate(harvests);
        System.out.println("Статистика урожая: ");
        for (HarvestStatistic statistic : statistics) {
            System.out.println(statistic);
        }
    }
}