package ru.netology.stats;

public class StatsService {

    public int total(int[] sales) {
        int total = 0;
        for (int sale : sales) {
            total += sale;
        }
        return total;
    }

    public int average(int[] sales) {
        return total(sales) / sales.length;
    }

    public int maximumSalesMonth(int[] sales) {

        int maximum = 0;
        int month = 0;
        int monthMaximum = 0;
        for (int sale : sales) {
            month += 1;
            if (sale > maximum) {
                maximum = sale;
                monthMaximum = month;
            }
        }
        return monthMaximum;
    }

    public int minimumSalesMonth(int[] sales) {
        int month = 1;
        int monthMinimum = 1;
        int minimum = sales[0];
        for (int sale : sales) {
            if (sale < minimum) {
                minimum = sale;
                monthMinimum = month;
            }
            month += 1;
        }
        return monthMinimum;
    }

    public int lessAverageMonthes(int[] sales) {
        int average = average(sales);
        int number = 0;
        for (int sale : sales) {
            if (sale < average) {
                number += 1;
            }
        }
        return number;
    }

    public int moreAverageMonthes(int[] sales) {
        int average = average(sales);
        int number = 0;
        for (int sale : sales) {
            if (sale > average) {
                number += 1;
            }
        }
        return number;
    }

}