package com.futurecollars;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class MainTest {
    @Test
    void isEvenNumber() {
        //given
        int evenNumber = 20;
        int oddNumber = 15;

        //when
        boolean trueExpected = Main.isEvenNumber(evenNumber);
        boolean falseExpected = Main.isEvenNumber(oddNumber);

        //then
        Assertions.assertTrue(trueExpected);
        Assertions.assertFalse(falseExpected);

    }
    @Test
    void isOddNumber() {
        //given
        int evenNumber = 20;
        int oddNumber = 15;

        //when
        boolean trueExpected = Main.isOddNumber(oddNumber);
        boolean falseExpected = Main.isOddNumber(evenNumber);

        //then
        Assertions.assertTrue(trueExpected);
        Assertions.assertFalse(falseExpected);


    }
}