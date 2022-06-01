package ru.netology.sqr.DZ5.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {

    @ParameterizedTest
//    @CsvSource({
//            "3, 200, 300",
//            "1, 200, 250"
//    })
    @CsvFileSource(files = "src/test/resources/intervalValuesForSQRSerciveTest.csv")
    public void shouldCalcExact(int expected, int minSQR, int maxSQR) {
        SQRService service = new SQRService();

        int actual = service.squareRoot(minSQR, maxSQR);

        Assertions.assertEquals(expected, actual);
        System.out.println("Сумма итераций полного цикла: " + expected + " при интервале " + minSQR + " - " + maxSQR);
    }

    // @Test
    // public void shouldCalcExact() {
    //   SQRService service = new SQRService();

    //  int expected = 3;
    //  int actual = service.squareRoot(200, 300);

    //   Assertions.assertEquals(expected, actual);
    // }

    // @Test
    // public void shouldCalcInexact() {
    //    SQRService service = new SQRService();

    //   int expected = 1;
    //  int actual = service.squareRoot(200, 250);

    //  Assertions.assertEquals(expected, actual);
    // }

}
