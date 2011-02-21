/**
 * 
 */
package org.bipsterite.functional;

import static org.bipsterite.functional.FunctionalTestSuite.driver;
import static org.bipsterite.functional.FunctionalTestSuite.BASE_URL;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author bippy
 *
 */
public class WelcomePageTests {
    private static String TITLE_LOGGED_OUT = "Welcome!";

    @Test public void testLoggedOutTitle() {
        driver.get(BASE_URL);
        
        Assert.assertEquals(TITLE_LOGGED_OUT, driver.getTitle());
    }
}
