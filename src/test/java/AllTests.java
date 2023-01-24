package test.java;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author Andrew Steele - aesteele
 * CIS175 - Spring 2023
 * 01/22/2023
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({ TestDamageAndXP.class, TestHealthAndName.class })
public class AllTests {
}
