package de.gardeningplanner.model.crops;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AubergineTest {

    private Crop crop;

    @Before
    public void setUp() throws Exception {
        crop = new Aubergine();
    }

    @Test
    public void getName_shouldReturnString_Aubergine(){
        String expected = "Aubergine";

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
    public void getExtend_shouldReturnInteger_50(){
        int expected = 50;

        int actual = crop.getExtend();

        assertEquals(expected,actual);
    }
}