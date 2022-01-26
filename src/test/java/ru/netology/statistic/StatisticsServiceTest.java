package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    @Test
    void findMaxStValue() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 0, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxAllNegative() {
        StatisticsService service = new StatisticsService();

        long[] i = {-12, -5, -8, -4, -5, -3, -3, -6, -11, -11, -12};
        long expected = -3;

        long actual = service.findMax(i);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxNegativeAndPositive() {
        StatisticsService service = new StatisticsService();

        long[] i = {-12, 5, 8, 4, -5, 0, 8, 6, -11, 11, -12};
        long expected = 11;

        long actual = service.findMax(i);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxBiggestValue() {
        StatisticsService service = new StatisticsService();

        long[] i = {-125745, 557457, 8457457, 457457, -5457457, 3346547, 85757, 657574, -1157457, 115754754, -12756574};
        long expected = 115754754;

        long actual = service.findMax(i);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxTheSameValue() {
        StatisticsService service = new StatisticsService();

        long[] i = { 1, 1, 1, 1, 1, 1, 1};
        long expected = 1;

        long actual = service.findMax(i);

        assertEquals(expected, actual);
    }

}