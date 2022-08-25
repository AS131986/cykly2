package ru.netology.stats;

public class StatsService {

    public int sumAllSales(int[] sales) {
        int allsales = 0;
        for (int sale : sales) {
            allsales = allsales + sale;
        }
        return allsales;
    }

    public int averageSales(int[] sales) {
        int averageSale = 0;
        averageSale = sumAllSales(sales) / sales.length;
        return averageSale;
    }

    public int maxSalesMonth(int[] sales) {
        int max = 0;
        int maxInd = 0;
        for (int i = 0; i < 12; i++) {
            if (sales[i] > max) {
                max = sales[i];
                maxInd = i;

            }
        }
        return maxInd;
    }

    public int salesLessAverage(int[] sales) {
        int average = averageSales(sales);
        int count = 0;
        for (int i = 0; i < 12; i++) {
            if (sales[i] < average) {
                count++;
            }

        }
        return count;
    }

    public int salesMoreAverage(int[] sales) {
        int average = averageSales(sales);
        int count = 0;
        for (int i = 0; i < 12; i++) {
            if (sales[i] > average) {
                count++;
            }

        }
        return count;
    }

    public int minSalesMonth(int[] sales) {
        int min = sales[0];
        int minInd = 0;
        for (int i = 0; i < 12; i++) {
            if (sales[i] <= min) {
                min = sales[i];
                minInd = i;

            }
        }
        return minInd;
    }
    }

