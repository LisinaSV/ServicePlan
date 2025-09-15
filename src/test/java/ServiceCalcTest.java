package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.services.ServiceCalc;

public class ServiceCalcTest {
    @ParameterizedTest
    //@CsvSource({
           // "10000,3000,20000",
           // "100000,60000,150000"
    //})
    @CsvFileSource(files="src/test/resources/money.csv")
    public void calculationOfParameters(int income, int expenses, int threshold) {
        ServiceCalc service = new ServiceCalc();
        int count = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(income, expenses, threshold);
    }
}