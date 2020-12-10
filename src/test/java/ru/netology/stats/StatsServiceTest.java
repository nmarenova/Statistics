package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    public StatsService service = new StatsService();
    public int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void shouldTotalSales() {
        int expected = 180;
        int actual = service.total(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldAverageSalesPerMonth() {
        int expected = 15;
        int actual = service.average(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMonthInWhichSalesMaximum() {
        int expected = 6;
        int actual = service.maximumSalesMonth(sales);
        assertEquals(expected, actual);

    }

    @Test
    void shouldMonthInWhichSalesMinimum() {
        int expected = 9;
        int actual = service.minimumSalesMonth(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldNumberOfMonthsBelowAverage() {
        int expected = 5;
        int actual = service.lessAverageMonthes(sales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldNumberOfMonthsAboveAverage() {
        int expected = 5;
        int actual = service.moreAverageMonthes(sales);
        assertEquals(expected, actual);
    }
}