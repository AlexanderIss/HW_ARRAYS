import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldFindSumSales() { // нахождение суммы продаж
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.findSumSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindAverageSales() { // нахождение среднего значения продаж
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.findAverageSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMaxSales() { //  нахождение номера месяца с максимальными продажами
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMinSales() { //  нахождение номера месяца с минимальными продажами
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindLessAverageSales() { //  нахождение количества месяцев, в которых продажи были ниже среднего
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.findLessAverageSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMoreAverageSales() { //  нахождение количества месяцев, в которых продажи были выше среднего
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.findMoreAverageSales(sales);
        Assertions.assertEquals(expected, actual);
    }

}
