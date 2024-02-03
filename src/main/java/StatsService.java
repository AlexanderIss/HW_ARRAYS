public class StatsService {


    public int findSumSales(int[] sales) {
        int sumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSales = sumSales + sales[i];
        }

        return sumSales;
    }

    public int findAverageSales(int[] sales) {
        int averageSales = findSumSales(sales);
        return averageSales / sales.length;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
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

    public int findLessAverageSales(int[] sales) {
        int averageSales = findAverageSales(sales);
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (averageSales > sales[i]) count++;
        }
        return count;
    }

    public int findMoreAverageSales(int[] sales) {
        int averageSales = findAverageSales(sales);
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (averageSales < sales[i]) count++;
        }
        return count;
    }
}





