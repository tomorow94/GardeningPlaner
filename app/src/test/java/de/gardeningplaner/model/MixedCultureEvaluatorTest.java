package de.gardeningplaner.model;

import org.junit.Test;

import de.gardeningplaner.model.MixedCultureEvaluator;
import de.gardeningplaner.model.crops.Aubergine;
import de.gardeningplaner.model.crops.BushBean;
import de.gardeningplaner.model.crops.ChineseCabbage;
import de.gardeningplaner.model.crops.CropTolerance;

import static org.junit.Assert.*;

public class MixedCultureEvaluatorTest {

    @Test
    public void evaluateTolerance_Aubergine_Aubergine_ShouldBeNUTRAL() {
        CropTolerance expected = CropTolerance.NUTRAL;
        MixedCultureEvaluator evaluator = new MixedCultureEvaluator();
        CropTolerance actual = evaluator.evaluateTolerance(new Aubergine(), new Aubergine());
        assertEquals(expected,actual);
    }

    @Test
    public void evaluateTolerance_Aubergine_BushBean_ShouldBeNUTRAL() {
        CropTolerance expected = CropTolerance.NUTRAL;
        MixedCultureEvaluator evaluator = new MixedCultureEvaluator();
        CropTolerance actual = evaluator.evaluateTolerance(new Aubergine(), new BushBean());
        assertEquals(expected,actual);
    }

    @Test
    public void evaluateTolerance_Aubergine_ChineseCabbage_ShouldBeNUTRAL() {
        CropTolerance expected = CropTolerance.NUTRAL;
        MixedCultureEvaluator evaluator = new MixedCultureEvaluator();
        CropTolerance actual = evaluator.evaluateTolerance(new Aubergine(), new ChineseCabbage());
        assertEquals(expected,actual);
    }
}