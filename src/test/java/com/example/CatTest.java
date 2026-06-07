package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CatTest {

    @Mock
    private Feline feline;

    private Cat cat;

    @BeforeEach
    public void init() {
        cat = new Cat(feline);
    }

    @Test
    public void getSoundReturnsMeow() {

        String actual = cat.getSound();

        assertEquals("Мяу", actual);
    }

    @Test
    public void getFoodReturnsPredatorFood() throws Exception {

        List<String> food =
                List.of("Животные", "Птицы", "Рыба");

        when(feline.eatMeat()).thenReturn(food);

        List<String> actual = cat.getFood();

        assertEquals(food, actual);
    }
}