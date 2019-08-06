package de.gardeningplaner.model.crops;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class AubergineTest {

    Crop aubergine;

    @BeforeClass
    public void beforeClass(){
        aubergine = new Aubergine();
    }

    @Test
    public void getName_shouldReturnString_Aubergine(){
        String expected = "Aubergine";

        String actual = aubergine.getName();

        assertEquals(expected, actual);
    }

}