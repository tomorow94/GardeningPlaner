package de.gardeningplaner.model.crops;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BushBeanTest {

    private Crop crop;

    @Before
    public void setUp() throws Exception {
        crop = new BushBean();
    }

    @Test
    public void getName_shouldReturnString_Buschbohne(){
        String expected = "Buschbohne";

        String actual = crop.getName();

        assertEquals(expected, actual);
    }

    @Test
    public void getRootLevel_shouldReturnRootLevel_HIGH(){
        RootLevel expected;
        expected = RootLevel.HIGH;

        RootLevel actual;
        actual = crop.getRootLevel();

        assertEquals(expected,actual);
    }

    @Test
    public void getNutrientNeeds_shouldReturnNutrientNeeds_LOW(){
        NutrientNeeds expected = NutrientNeeds.LOW;

        NutrientNeeds actual = crop.getNutrientNeeds();

        assertEquals(expected,actual);
    }

    @Test
    public void getExtend_shouldReturnInteger_45(){
        int expected = 45;

        int actual = crop.getExtend();

        assertEquals(expected,actual);
    }
}