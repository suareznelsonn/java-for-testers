package com.serenitydojo;

import static com.serenitydojo.model.AnimalType.CAT;
import static com.serenitydojo.model.AnimalType.DOG;
import static com.serenitydojo.model.AnimalType.HAMSTER;

import com.serenitydojo.model.Feeder;
import org.junit.Assert;
import org.junit.Test;

public class WhenFeedingTheAnimals {

    @Test
    public void shouldFeedCatTuna (){
        Feeder feeder = new Feeder();
        String food = feeder.feeds(CAT, false);
        Assert.assertEquals("Tuna",food);
    }
    @Test
    public void shouldFeedHamsterCabbage (){
        Feeder feeder = new Feeder();
        String food = feeder.feeds(HAMSTER, false);
        Assert.assertEquals("Cabbage",food);
    }

    @Test
    public void shouldFeedDogsFood (){
        Feeder feeder = new Feeder();
        String food = feeder.feeds(DOG, false);
        Assert.assertEquals("Dog Food",food);
    }

    @Test
    public void shouldFedPremiumCatsPremiumFood (){
        Feeder feeder = new Feeder();
        String food = feeder.feeds(CAT,true);
        Assert.assertEquals("Salmon",food);
    }

    @Test
    public void shouldFeedPremiumDogsDeluxeDogFood() {
        Feeder feeder = new Feeder();
        String food = feeder.feeds(DOG, true);
        Assert.assertEquals("Meat", food);

    }

    @Test
    public void shouldFeedPremiumHamstersLettuce() {
        Feeder feeder = new Feeder();
        String food = feeder.feeds(HAMSTER, true);
        Assert.assertEquals("Letucce", food);

    }
}
