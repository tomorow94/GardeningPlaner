package de.gardeningplanner.model;

import org.junit.Test;

import de.gardeningplanner.model.crops.Aubergine;
import de.gardeningplanner.model.crops.BushBean;
import de.gardeningplanner.model.crops.ChineseCabbage;
import de.gardeningplanner.model.crops.CropTolerance;

import static org.junit.Assert.assertEquals;

public class MixedCultureEvaluatorTest {

    @Test
    public void evaluateTolerance_Aubergine_Aubergine_ShouldBeNUTRAL() {
        CropTolerance expected = CropTolerance.NEUTRAL;
        MixedCultureEvaluator evaluator = new MixedCultureEvaluator();
        CropTolerance actual = evaluator.evaluateTolerance(new Aubergine(), new Aubergine());
        assertEquals(expected,actual);
    }

    @Test
    public void evaluateTolerance_Aubergine_BushBean_ShouldBeNUTRAL() {
        CropTolerance expected = CropTolerance.NEUTRAL;
        MixedCultureEvaluator evaluator = new MixedCultureEvaluator();
        CropTolerance actual = evaluator.evaluateTolerance(new Aubergine(), new BushBean());
        assertEquals(expected,actual);
    }

    @Test
    public void evaluateTolerance_Aubergine_ChineseCabbage_ShouldBeNUTRAL() {
        CropTolerance expected = CropTolerance.NEUTRAL;
        MixedCultureEvaluator evaluator = new MixedCultureEvaluator();
        CropTolerance actual = evaluator.evaluateTolerance(new Aubergine(), new ChineseCabbage());
        assertEquals(expected,actual);
    }
}