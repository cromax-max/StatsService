package ru.netology.stats;

public class StatsService {

    public long calculateSalesSum(int[] arr) {
        long sumSales = 0;
        for (long e : arr) {
            sumSales += e;
        }
        return sumSales;
    }

    public long calculateAverageMonthSum(int[] arr) {
        return calculateSalesSum(arr) / arr.length;
    }

    public int maxMonth(int[] arr) {
        int maxMonth = 0;
        int index = 0;
        for (int e : arr) {
            if (e >= arr[maxMonth]) {
                maxMonth = index;
            }
            index++;
        }
        return maxMonth + 1;
    }

    public int minMonth(int[] arr) {
        int minMonth = 0;
        int index = 0;
        for (int e : arr) {
            if (e <= arr[minMonth]) {
                minMonth = index;
            }
            index++;
        }
        return minMonth + 1;
    }

    public int countMonthBelowAverage(int[] arr) {
        int countMonth = 0;
        long averageSum = calculateAverageMonthSum(arr);
        for (int e : arr) {
            if (e <= averageSum) {
                countMonth++;
            }
        }
        return countMonth;
    }

    public int countMonthAboveAverage(int[] arr) {
        int countMonth = 0;
        long averageSum = calculateAverageMonthSum(arr);
        for (int e : arr) {
            if (e > averageSum) {
                countMonth++;
            }
        }
        return countMonth;
    }
}
