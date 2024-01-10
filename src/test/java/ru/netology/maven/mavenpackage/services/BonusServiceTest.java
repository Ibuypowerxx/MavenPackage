package ru.netology.maven.mavenpackage.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class BonusServiceTest {

    @Test
    void shouldCalcthreemounth() {
        BonusService service = new BonusService();

        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;
        long expected = 3;

        // вызываем целевой метод:
        int actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }


    @Test
    void shouldCalctwomounth() {
        BonusService service = new BonusService();

        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        long expected = 2;


        // вызываем целевой метод:
        int actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}
