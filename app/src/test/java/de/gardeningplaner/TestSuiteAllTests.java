package de.gardeningplaner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import de.gardeningplaner.model.TestSuiteModels;

@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                TestSuiteModels.class
        }
)

public class TestSuiteAllTests {
}
