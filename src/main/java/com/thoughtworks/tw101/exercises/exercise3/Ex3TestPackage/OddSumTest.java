package com.thoughtworks.tw101.exercises.exercise3.Ex3TestPackage;

import com.thoughtworks.tw101.exercises.exercise3.OddSum;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OddSumTest {

    @Test
    public void testOf() {
        OddSum test = new OddSum();
        assertEquals(25, test.of(1, 10));

    }
}

