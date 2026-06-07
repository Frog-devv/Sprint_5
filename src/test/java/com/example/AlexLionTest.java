package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AlexLionTest {

    @Mock
    private Predator predator;

    private AlexLion alexLion;

    @BeforeEach
    public void setUp() throws Exception {
        alexLion = new AlexLion(predator);
    }

    @Test
    public void getKittensReturnsZero() {

        int actual = alexLion.getKittens();

        assertEquals(0, actual);
    }

    @Test
    public void getFriendsReturnsCorrectFriends() {

        List<String> expected = List.of(
                "Марти",
                "Глория",
                "Мелман"
        );

        List<String> actual = alexLion.getFriends();

        assertEquals(expected, actual);
    }

    @Test
    public void getPlaceOfLivingReturnsZoo() {

        String actual = alexLion.getPlaceOfLiving();

        assertEquals(
                "Нью-Йоркский зоопарк",
                actual
        );
    }

    @Test
    public void doesHaveManeReturnsTrue() {

        assertTrue(alexLion.doesHaveMane());
    }

    @Test
    public void getFoodReturnsPredatorFood() throws Exception {

        List<String> expected =
                List.of("Животные", "Птицы", "Рыба");

        when(predator.eatMeat()).thenReturn(expected);

        List<String> actual = alexLion.getFood();

        assertEquals(expected, actual);
    }
}