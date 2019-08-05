package de.gardeningplaner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import de.gardeningplaner.model.TestSuiteModels;
/**
 * For more information in testing in android...
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                TestSuiteModels.class
        }
)

public class TestSuiteAllTests {
}
