package de.gardeningplaner.model.crops;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import de.gardeningplaner.model.MixedCultureEvaluatorTest;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                AubergineTest.class,
                BushBeanTest.class,
                ChineseCabbageTest.class
        }
)

public class TestSuiteCrops {
}
