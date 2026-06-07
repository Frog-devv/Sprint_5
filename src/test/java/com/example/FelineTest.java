package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FelineTest {

    private final Feline feline = new Feline();

    @Test
    public void getFamilyReturnsCatFamily() {

        String actual = feline.getFamily();

        assertEquals("Кошачьи", actual);
    }

    @Test
    public void eatMeatReturnsPredatorFood() throws Exception {

        List<String> actual = feline.eatMeat();

        List<String> expected =
                List.of("Животные", "Птицы", "Рыба");

        assertEquals(expected, actual);
    }

    @Test
    public void getDefaultKittens() {

        int actual = feline.getKittens();

        assertEquals(1, actual);
    }


}