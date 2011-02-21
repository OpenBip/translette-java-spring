/**
 * 
 */
package org.bipsterite.functional;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

/**
 * @author bippy
 *
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    WelcomePageTests.class
})
public class FunctionalTestSuite {
    public static WebDriver driver;
    public static String BASE_URL = "http://localhost:8080/translette-java-spring";

    @BeforeClass
    static public void blahMethod() {
        driver = new HtmlUnitDriver(); 
    }
    
    @AfterClass
    static public void blahMethod2() {
        driver.close();
    }
}
