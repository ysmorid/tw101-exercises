package com.thoughtworks.tw101.exercises.exercise3

class OddSumTest extends GroovyTestCase {
    void testOf() {
        OddSum test = new OddSum();
        assertEquals(25, test.of(1, 10));
    }
}
