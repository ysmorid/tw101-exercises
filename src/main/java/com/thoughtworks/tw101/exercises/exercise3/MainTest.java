package com.thoughtworks.tw101.exercises.exercise3;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by jenniferruiz on 12/15/16.
 */
class MainTest {
    @org.junit.jupiter.api.Test
    void main() {
        OddSum test = new OddSum();
        assertEquals(25, test.of(1, 10));
    }

}