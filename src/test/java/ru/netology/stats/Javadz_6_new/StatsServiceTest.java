package ru.netology.stats.Javadz_6_new;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldCalculateSumOfSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        int actual = service.sumAllSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageSalesVolumeShouldCalculated() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;
        int actual = service.midSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSumMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actual = service.monthOfMaximumSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSumMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = service.monthOfMinimumSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculatedLessThanAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.selesBelowAverage(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCalculatedMoreThanAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.selesBeMoreAverage(sales);

        Assertions.assertEquals(expected, actual);

    }
}
