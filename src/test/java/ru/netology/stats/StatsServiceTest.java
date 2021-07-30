package ru.netology.stats;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService service = new StatsService();

    @Test
    void shouldCalculateSalesSum() {
        long actual = service.calculateSalesSum(sales);
        long expected = 180;

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverageMonthSum() {
        long actual = service.calculateAverageMonthSum(sales);
        long expected = 15;

        assertEquals(expected, actual);
    }

    @Test
    void shouldGetMaxMonth() {
        long actual = service.maxMonth(sales);
        long expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    void shouldGetMinMonth() {
        long actual = service.minMonth(sales);
        long expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void shouldGetCountMonthBelowAverage() {
        long actual = service.countMonthBelowAverage(sales);
        long expected = 7;

        assertEquals(expected, actual);
    }

    @Test
    void shouldGetCountMonthAboveAverage() {
        long actual = service.countMonthAboveAverage(sales);
        long expected = 5;

        assertEquals(expected, actual);
    }
}