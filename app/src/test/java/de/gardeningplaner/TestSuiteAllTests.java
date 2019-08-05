package de.gardeningplaner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import de.gardeningplaner.model.crops.TestSuiteCrops;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                TestSuiteCrops.class
        }
)

public class TestSuiteAllTests {
}
