package ru.netology.stats.Javadz_6_new;

public class StatsService {
    public int sumAllSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    public int midSales(int[] sales) {
        int sum = sumAllSales(sales);

        int midSale = sum / sales.length;
        return midSale;
    }

    public int monthOfMaximumSales(int[] sales) {

        int max = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[max]) {
                max = i;
            }
        }
        return max + 1;
    }

    public int monthOfMinimumSales(int[] sales) {
        int min = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[min]) {
                min = i;
            }
        }
        return min + 1;

    }

    public int selesBelowAverage(int[] sales) {
        int average = midSales(sales);
        int count = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                count++;
            }
        }
        return count;
    }

    public int selesBeMoreAverage(int[] sales) {
        int avarage = midSales(sales);
        int count = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > avarage) {
                count++;
            }
        }
        return count;
    }
}
