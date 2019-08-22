package de.gardeningplanner.model;

import org.junit.Before;
import org.junit.Test;

import de.gardeningplanner.model.crops.Aubergine;
import de.gardeningplanner.model.crops.Beetroot;
import de.gardeningplanner.model.crops.BushBean;
import de.gardeningplanner.model.crops.Cabbage;
import de.gardeningplanner.model.crops.Carrot;
import de.gardeningplanner.model.crops.Celery;
import de.gardeningplanner.model.crops.Chard;
import de.gardeningplanner.model.crops.ChineseCabbage;
import de.gardeningplanner.model.crops.CropTolerance;
import de.gardeningplanner.model.crops.Cucumber;
import de.gardeningplanner.model.crops.Endive;
import de.gardeningplanner.model.crops.Fennel;
import de.gardeningplanner.model.crops.Garlic;
import de.gardeningplanner.model.crops.Horseradish;
import de.gardeningplanner.model.crops.Kohlrabi;
import de.gardeningplanner.model.crops.LambsLettuce;
import de.gardeningplanner.model.crops.Leek;
import de.gardeningplanner.model.crops.Lettuce;
import de.gardeningplanner.model.crops.Onion;
import de.gardeningplanner.model.crops.Pea;
import de.gardeningplanner.model.crops.Potato;
import de.gardeningplanner.model.crops.Radish;
import de.gardeningplanner.model.crops.Rhubarb;
import de.gardeningplanner.model.crops.RunnerBeans;
import de.gardeningplanner.model.crops.Spinach;
import de.gardeningplanner.model.crops.Strawberry;
import de.gardeningplanner.model.crops.Zucchini;

import static org.junit.Assert.assertEquals;

public class MixedCultureEvaluatorTest {

    private MixedCultureEvaluator evaluator;

    @Before
    public void setUp() throws Exception {
        evaluator = new MixedCultureEvaluator();
    }

    @Test
    public void getTolerance_AubergineAndAubergine_NEUTRAL(){
        CropTolerance expected;
        expected = CropTolerance.NEUTRAL;

        CropTolerance actual;
        actual = evaluator.getTolerance(new Aubergine(), new Aubergine());

        assertEquals(expected,actual);
    }

    @Test
    public void getTolerance_AubergineAndBeetroot_NEUTRAL(){
        CropTolerance expected;
        expected = CropTolerance.NEUTRAL;

        CropTolerance actual;
        actual = evaluator.getTolerance(new Aubergine(), new Beetroot());

        assertEquals(expected,actual);
    }

    @Test
    public void getTolerance_AubergineAndBushBean_NEUTRAL(){
        CropTolerance expected;
        expected = CropTolerance.NEUTRAL;

        CropTolerance actual;
        actual = evaluator.getTolerance(new Aubergine(), new BushBean());

        assertEquals(expected,actual);
    }

    @Test
    public void getTolerance_AubergineAndCabbage_SUPPORTIVE(){
        CropTolerance expected;
        expected = CropTolerance.SUPPORTIVE;

        CropTolerance actual;
        actual = evaluator.getTolerance(new Aubergine(), new Cabbage());

        assertEquals(expected,actual);
    }

    @Test
    public void getTolerance_AubergineAndCarrot_OBSTRUCTIVE(){
        CropTolerance expected;
        expected = CropTolerance.OBSTRUCTIVE;

        CropTolerance actual;
        actual = evaluator.getTolerance(new Aubergine(), new Carrot());

        assertEquals(expected,actual);
    }

    @Test
    public void getTolerance_AubergineAndCelery_NEUTRAL(){
        CropTolerance expected;
        expected = CropTolerance.NEUTRAL;

        CropTolerance actual;
        actual = evaluator.getTolerance(new Aubergine(), new Celery());

        assertEquals(expected,actual);
    }

    @Test
    public void getTolerance_AubergineAndChard_NEUTRAL(){
        CropTolerance expected;
        expected = CropTolerance.NEUTRAL;

        CropTolerance actual;
        actual = evaluator.getTolerance(new Aubergine(), new Chard());

        assertEquals(expected,actual);
    }

    @Test
    public void getTolerance_AubergineAndChineseCabbage_NEUTRAL(){
        CropTolerance expected;
        expected = CropTolerance.NEUTRAL;

        CropTolerance actual;
        actual = evaluator.getTolerance(new Aubergine(), new ChineseCabbage());

        assertEquals(expected,actual);
    }

    @Test
    public void getTolerance_AubergineAndCucumber_NEUTRAL(){
        CropTolerance expected;
        expected = CropTolerance.NEUTRAL;

        CropTolerance actual;
        actual = evaluator.getTolerance(new Aubergine(), new Cucumber());

        assertEquals(expected,actual);
    }

    @Test
    public void getTolerance_AubergineAndEndive_NEUTRAL(){
        CropTolerance expected;
        expected = CropTolerance.NEUTRAL;

        CropTolerance actual;
        actual = evaluator.getTolerance(new Aubergine(), new Endive());

        assertEquals(expected,actual);
    }

    @Test
    public void getTolerance_AubergineAndFennel_NEUTRAL(){
        CropTolerance expected;
        expected = CropTolerance.NEUTRAL;

        CropTolerance actual;
        actual = evaluator.getTolerance(new Aubergine(), new Fennel());

        assertEquals(expected,actual);
    }

    @Test
    public void getTolerance_AubergineAndGarlic_NEUTRAL(){
        CropTolerance expected;
        expected = CropTolerance.NEUTRAL;

        CropTolerance actual;
        actual = evaluator.getTolerance(new Aubergine(), new Garlic());

        assertEquals(expected,actual);
    }

    @Test
    public void getTolerance_AubergineAndHorseradish_NEUTRAL(){
        CropTolerance expected;
        expected = CropTolerance.NEUTRAL;

        CropTolerance actual;
        actual = evaluator.getTolerance(new Aubergine(), new Horseradish());

        assertEquals(expected,actual);
    }

    @Test
    public void getTolerance_AubergineAndKohlrabi_NEUTRAL(){
        CropTolerance expected;
        expected = CropTolerance.NEUTRAL;

        CropTolerance actual;
        actual = evaluator.getTolerance(new Aubergine(), new Kohlrabi());

        assertEquals(expected,actual);
    }

    @Test
    public void getTolerance_AubergineAndLambsLettuce_NEUTRAL(){
        CropTolerance expected;
        expected = CropTolerance.NEUTRAL;

        CropTolerance actual;
        actual = evaluator.getTolerance(new Aubergine(), new LambsLettuce());

        assertEquals(expected,actual);
    }

    @Test
    public void getTolerance_AubergineAndLeek_NEUTRAL(){
        CropTolerance expected;
        expected = CropTolerance.NEUTRAL;

        CropTolerance actual;
        actual = evaluator.getTolerance(new Aubergine(), new Leek());

        assertEquals(expected,actual);
    }

    @Test
    public void getTolerance_AubergineAndLettuce_SUPPORTIVE(){
        CropTolerance expected;
        expected = CropTolerance.SUPPORTIVE;

        CropTolerance actual;
        actual = evaluator.getTolerance(new Aubergine(), new Lettuce());

        assertEquals(expected,actual);
    }

    @Test
    public void getTolerance_AubergineAndOnion_NEUTRAL(){
        CropTolerance expected;
        expected = CropTolerance.NEUTRAL;

        CropTolerance actual;
        actual = evaluator.getTolerance(new Aubergine(), new Onion());

        assertEquals(expected,actual);
    }

    @Test
    public void getTolerance_AubergineAndPea_NEUTRAL(){
        CropTolerance expected;
        expected = CropTolerance.NEUTRAL;

        CropTolerance actual;
        actual = evaluator.getTolerance(new Aubergine(), new Pea());

        assertEquals(expected,actual);
    }

    @Test
    public void getTolerance_AubergineAndPotato_NEUTRAL(){
        CropTolerance expected;
        expected = CropTolerance.NEUTRAL;

        CropTolerance actual;
        actual = evaluator.getTolerance(new Aubergine(), new Potato());

        assertEquals(expected,actual);
    }

    @Test
    public void getTolerance_AubergineAndRadish_NEUTRAL(){
        CropTolerance expected;
        expected = CropTolerance.NEUTRAL;

        CropTolerance actual;
        actual = evaluator.getTolerance(new Aubergine(), new Radish());

        assertEquals(expected,actual);
    }

    @Test
    public void getTolerance_AubergineAndRhubarb_NEUTRAL(){
        CropTolerance expected;
        expected = CropTolerance.NEUTRAL;

        CropTolerance actual;
        actual = evaluator.getTolerance(new Aubergine(), new Rhubarb());

        assertEquals(expected,actual);
    }

    @Test
    public void getTolerance_AubergineAndRunnerBeans_NEUTRAL(){
        CropTolerance expected;
        expected = CropTolerance.NEUTRAL;

        CropTolerance actual;
        actual = evaluator.getTolerance(new Aubergine(), new RunnerBeans());

        assertEquals(expected,actual);
    }

    @Test
    public void getTolerance_AubergineAndSpinach_SUPPORTIVE(){
        CropTolerance expected;
        expected = CropTolerance.SUPPORTIVE;

        CropTolerance actual;
        actual = evaluator.getTolerance(new Aubergine(), new Spinach());

        assertEquals(expected,actual);
    }

    @Test
    public void getTolerance_AubergineAndStrawberry_NEUTRAL(){
        CropTolerance expected;
        expected = CropTolerance.NEUTRAL;

        CropTolerance actual;
        actual = evaluator.getTolerance(new Aubergine(), new Strawberry());

        assertEquals(expected,actual);
    }

    @Test
    public void getTolerance_AubergineAndZucchini_NEUTRAL(){
        CropTolerance expected;
        expected = CropTolerance.NEUTRAL;

        CropTolerance actual;
        actual = evaluator.getTolerance(new Aubergine(), new Zucchini());

        assertEquals(expected,actual);
    }
}