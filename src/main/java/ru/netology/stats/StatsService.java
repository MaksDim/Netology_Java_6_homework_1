package ru.netology.stats;

public class StatsService {

    public int calculateSumOfAllSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public int calculateAverageMonthlySales(int[] sales) {
        return calculateSumOfAllSales(sales) / sales.length;
    }

    public int numMonthMaxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int numMonthMinSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int calculateQuantityMonthMaxSales(int[] sales) {
        int month = 0;
        int average = calculateAverageMonthlySales(sales);
        for (int sale : sales) {
            if (sale > average) {
                month += 1;
            }
        }
        return month;
    }

    public int calculateQuantityMonthMinSales(int[] sales) {
        int month = 0;
        int average = calculateAverageMonthlySales(sales);
        for (int sale : sales) {
            if (sale < average) {
                month += 1;
            }
        }
        return month;
    }
}
