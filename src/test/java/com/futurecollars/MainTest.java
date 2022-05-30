package com.futurecollars;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class MainTest {
    @Test
    void shouldBeEvenWhenCheckingIfEven() {
        //given
        int evenNumber = 20;

        //when
        String evenExpected = Main.isEvenNumber(evenNumber) ? "Liczba jest parzysta" : "Liczba nie jest parzysta";

        //then
        Assertions.assertEquals("Liczba jest parzysta", evenExpected);

    }

    @Test
    void shouldNotBeEvenWhenCheckingIfEven() {
        //given
        int oddNumber = 15;

        //when
        String notEvenExpected = Main.isEvenNumber(oddNumber) ? "Liczba jest parzysta" : "Liczba nie jest parzysta";

        //then
        Assertions.assertEquals("Liczba nie jest parzysta", notEvenExpected);


    }

    @Test
    void shouldBeOddWhenCheckingIfOdd() {
        //given
        int oddNumber = 15;

        //when
        String oddExpected = Main.isOddNumber(oddNumber) ? "Liczba jest nieparzysta" : "Liczba nie jest nieparzysta";

        //then
        Assertions.assertEquals("Liczba jest nieparzysta", oddExpected);


    }

    @Test
    void shouldNotBeOddWhenCheckingIfOdd() {
        //given
        int evenNumber = 20;

        //when
        String notOddExpected = Main.isOddNumber(evenNumber) ? "Liczba jest nieparzysta" : "Liczba nie jest nieparzysta";

        //then
        Assertions.assertEquals("Liczba nie jest nieparzysta", notOddExpected);

    }
}