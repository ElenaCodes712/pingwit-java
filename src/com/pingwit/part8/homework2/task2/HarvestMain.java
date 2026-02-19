package com.pingwit.part8.homework2.task2;

import java.math.BigDecimal;

public class HarvestMain {
    public static void main(String[] args) {
        Harvest[] harvests = {
                new Harvest(1l, "field 1", "carrot", BigDecimal.valueOf(109.8)),
                new Harvest(2l, "field 2", "tomato", BigDecimal.valueOf(150.0)),
                new Harvest(3l, "field 3", "onion", BigDecimal.valueOf(250.0)),
                new Harvest(4l, "field 2", "potato", BigDecimal.valueOf(190.0)),
                new Harvest(5l, "field 4", "potato", BigDecimal.valueOf(200.0))
        };

        HarvestStatisticService service = new HarvestStatisticService();
        HarvestStatistic[] statistics = service.calculate(harvests);
        System.out.println("Статистика урожая: ");
        for (HarvestStatistic statistic : statistics) {
            System.out.println(statistic);
        }
    }
}
