package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {


    @Test
    void testCorrectCalc() {
        SQRService service = new SQRService();
        int expected = 3;

        int actual = service.sqrCount(200, 300);

        assertEquals(expected, actual);
    }

    @Test
    void testCorrectCalcInclusive() {
        SQRService service = new SQRService();
        int expected = 4;

        int actual = service.sqrCount(121, 196);

        assertEquals(expected, actual);
    }

    @Test
    void testCorrectCalcNotInRange() {
        SQRService service = new SQRService();
        int expected = 0;

        int actual = service.sqrCount(0, 10);

        assertEquals(expected, actual);
    }
}
