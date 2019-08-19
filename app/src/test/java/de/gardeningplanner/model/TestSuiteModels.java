package de.gardeningplanner.model;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import de.gardeningplanner.model.crops.TestSuiteCrops;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                MixedCultureEvaluatorTest.class,
                TestSuiteCrops.class
        }
)

public class TestSuiteModels {
}
