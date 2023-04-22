package ru.netology.stats;

public class StatsService {

    public int sumSales(int[] sales) {
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public double averageAmountSales(int[] sales) {
        double averageAmount = 0;
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return averageAmount = sum / sales.length;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int belowAverageSales(int[] sales) {
        int belowAverageMonth = 0;
        double averageAmount = averageAmountSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageAmount) {
                belowAverageMonth = belowAverageMonth + 1;
            }
        }
        return belowAverageMonth;
    }

    public int aboveAverageSales(int[] sales) {
        int aboveAverageMonth = 0;
        double averageAmount = averageAmountSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageAmount) {
                aboveAverageMonth = aboveAverageMonth + 1;
            }
        }
        return aboveAverageMonth;
    }
}
