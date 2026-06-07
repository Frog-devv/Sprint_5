package com.example;

import java.util.List;

public class AlexLion extends Lion {

    public AlexLion(Predator predator) throws Exception {
        super("Самец", predator);
    }

    @Override
    public int getKittens() {
        return 0;
    }

    public List<String> getFriends() {
        return List.of(
                "Марти",
                "Глория",
                "Мелман"
        );
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }
}