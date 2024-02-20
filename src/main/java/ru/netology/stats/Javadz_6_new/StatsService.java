package ru.netology.stats.Javadz_6_new;

public class StatsService {
    public int SumAllSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    public int MidSales(int[] sales) {
        int sum = SumAllSales(sales);

        int midSale = sum / sales.length;
        return midSale;
    }

    public int MonthOfMaximumSales(int[] sales) {

        int max = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[max]) {
                max = i;
            }
        }
        return max + 1;
    }

    public int MonthOfMinimumSales(int[] sales) {
        int min = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[min]) {
                min = i;
            }
        }
        return min + 1;

    }

    public int SelesBelowAverage(int[] sales) {
        int average = MidSales(sales);
        int count = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                count++;
            }
        }
        return count;
    }

    public int SelesBeMoreAverage(int[] sales) {
        int avarage = MidSales(sales);
        int count = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > avarage) {
                count++;
            }
        }
        return count;
    }
}
