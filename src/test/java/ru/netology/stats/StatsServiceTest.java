package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.annotation.processing.SupportedAnnotationTypes;

public class StatsServiceTest {

    @Test
    public void sumSales(){
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20 ,7 ,14, 14, 18};
        int expected = 180;
        int actual = service.sumSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageAmountSales(){
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20 ,7 ,14, 14, 18};
        double expected = 15;
        double actual = service.averageAmountSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void statsMaxMonth(){
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20 ,7 ,14, 14, 18};
        int expected = 8;
        int actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void statsMinMonth(){
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20 ,7 ,14, 14, 18};
        int expected = 9;
        int actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void belowAverageSum(){
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20 ,7 ,14, 14, 18};
        int expected = 5;
        int actual = service.belowAverageSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void aboveAverageSales(){
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20 ,7 ,14, 14, 18};
        int expected = 5;
        int actual = service.aboveAverageSales(sales);
        Assertions.assertEquals(expected, actual);
    }
}
