package de.gardeningplaner.model;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import de.gardeningplaner.model.crops.TestSuiteCrops;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                MixedCultureEvaluatorTest.class,
                TestSuiteCrops.class
        }
)

public class TestSuiteModels {
}
