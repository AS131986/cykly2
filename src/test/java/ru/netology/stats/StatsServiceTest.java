package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void shouldCalcSumAllSales() {
        StatsService service = new StatsService();
        int[] allSales = sales;
        int expected = 180;

        int actual = service.sumAllSales(allSales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalcAverageSales() {
        StatsService service = new StatsService();
        int[] allSales = sales;
        int expected = 15;
        int actual = service.averageSales(allSales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalcMaxSales() {
        StatsService service = new StatsService();
        int[] allSales = sales;
        int expected = 5;
        int actual = service.maxSalesMonth(allSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalcLessAverage() {
        StatsService service = new StatsService();
        int[] allSales = sales;
        int expected = 5;
        int actual = service.maxSalesMonth(allSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalcMoreAverage() {
        StatsService service = new StatsService();
        int[] allSales = sales;
        int expected = 5;
        int actual = service.maxSalesMonth(allSales);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalcMinSales() {
        StatsService service = new StatsService();
        int[] allSales = sales;
        int expected = 8;
        int actual = service.minSalesMonth(allSales);
        assertEquals(expected, actual);
    }
}