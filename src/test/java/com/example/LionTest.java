package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class LionTest {

    @Mock
    private Predator predator;

    @Test
    public void getFoodReturnsPredatorFood() throws Exception {

        List<String> food =
                List.of("Животные", "Птицы", "Рыба");

        when(predator.eatMeat()).thenReturn(food);

        Lion lion = new Lion("Самец", predator);

        List<String> actual = lion.getFood();

        assertEquals(food, actual);
    }

    @Test
    public void constructorThrowsExceptionForWrongSex() {

        Exception exception = assertThrows(
                Exception.class,
                () -> new Lion("Неизвестно", predator)
        );

        assertEquals(
                "Используйте допустимые значения пола животного - самей или самка",
                exception.getMessage()
        );
    }

    @Test
    public void getKittensReturnsOne() throws Exception {

        Lion lion = new Lion("Самец", predator);

        int actual = lion.getKittens();

        assertEquals(1, actual);
    }
}