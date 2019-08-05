package de.GardeningPlaner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import de.GardeningPlaner.Model.Crops.TestSuiteCrops;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                TestSuiteCrops.class
        }
)
public class TestSuiteAllTests {
}
