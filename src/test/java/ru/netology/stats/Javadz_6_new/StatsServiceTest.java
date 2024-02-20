package ru.netology.stats.Javadz_6_new;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldCalculateSumOfSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        int actual = service.SumAllSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void AverageSalesVolumeShouldCalculated() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;
        int actual = service.MidSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MaxSumMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actual = service.MonthOfMaximumSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void MinSumMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = service.MonthOfMinimumSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldCalculatedLessThanAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.SelesBelowAverage(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ShouldCalculatedMoreThanAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.SelesBeMoreAverage(sales);

        Assertions.assertEquals(expected, actual);

    }
}
