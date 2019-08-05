package de.GardeningPlaner.Model.Crops;

import org.junit.Test;

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