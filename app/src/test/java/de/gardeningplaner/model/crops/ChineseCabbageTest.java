package de.gardeningplaner.model.crops;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChineseCabbageTest {
    private Crop crop;

    @Before
    public void setUp() throws Exception {
        crop = new ChineseCabbage();
    }

    @Test
    public void getName_shouldReturnString_Chinakohl(){
        String expected = "Chinakohl";

        String actual = crop.getName();

        assertEquals(expected, actual);
    }

    @Test
    public void getRootLevel_shouldReturnRootLevel_MEDIUM(){
        RootLevel expected;
        expected = RootLevel.MEDIUM;

        RootLevel actual;
        actual = crop.getRootLevel();

        assertEquals(expected,actual);
    }

    @Test
    public void getNutrientNeeds_shouldReturnNutrientNeeds_HIGH(){
        NutrientNeeds expected = NutrientNeeds.HIGH;

        NutrientNeeds actual = crop.getNutrientNeeds();

        assertEquals(expected,actual);
    }

    @Test
    public void getExtend_shouldReturnInteger_35(){
        int expected = 35;

        int actual = crop.getExtend();

        assertEquals(expected,actual);
    }
}