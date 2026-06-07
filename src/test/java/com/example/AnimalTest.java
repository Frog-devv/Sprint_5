package com.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AnimalTest {

    private final Animal animal = new Animal();

    @Test
    public void testHerbivoreFood() throws Exception {

        List<String> actual = animal.getFood("Травоядное");

        assertEquals(
                List.of("Трава", "Различные растения"),
                actual
        );
    }

    @Test
    public void testPredatorFood() throws Exception {

        List<String> actual = animal.getFood("Хищник");

        assertEquals(
                List.of("Животные", "Птицы", "Рыба"),
                actual
        );
    }

    @Test
    public void testUnknownAnimalThrowsException() {

        Exception exception = assertThrows(
                Exception.class,
                () -> animal.getFood("Котик")
        );

        assertEquals(
                "Неизвестный вид животного, используйте значение Травоядное или Хищник",
                exception.getMessage()
        );
    }

    @Test
    public void testGetFamily() {

        String actual = animal.getFamily();

        String expected =
                "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";

        assertEquals(expected, actual);
    }
}