package de.gardeningplaner.model.crops;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AubergineTest {

    private Crop aubergine;

    @Before
    public void setUp() throws Exception {
        aubergine = new Aubergine();
    }

    @Test
    public void getName_shouldReturnString_Aubergine(){
        String expected = "Aubergine";

        String actual = aubergine.getName();

        assertEquals(expected, actual);
    }

    @Test
    public void getRootLevel_shouldReturnRootLevel_MEDIUM(){
        RootLevel expected;
        expected = RootLevel.MEDIUM;

        RootLevel actual;
        actual = aubergine.getRootLevel();

        assertEquals(expected,actual);
    }

    @Test
    public void getNutrientNeeds_shouldReturnNutrientNeeds_HIGH(){
        NutrientNeeds expected = NutrientNeeds.HIGH;

        NutrientNeeds actual = aubergine.getNutrientNeeds();

        assertEquals(expected,actual);
    }

    @Test
    public void getExtend_shouldReturnInteger_50(){
        int expected = 50;

        int actual = aubergine.getExtend();

        assertEquals(expected,actual);
    }
}