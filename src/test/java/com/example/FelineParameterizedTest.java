package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FelineParameterizedTest {

    private final Feline feline = new Feline();

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 5, 10})
    public void getKittensWithParam(int kittens) {

        int actual = feline.getKittens(kittens);

        assertEquals(kittens, actual);
    }
}
