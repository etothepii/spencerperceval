package uk.co.epii.spencerperceval.data;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * User: James Robinson
 * Date: 26/10/2013
 * Time: 18:35
 */
public class PostcodeMatcherTest {

    private static PostcodeMatcher instance;

    @BeforeClass
    public static void createInstance() {
        instance = new PostcodeMatcher();
        instance.init();
    }

    @Test
    public void containsPostcodeTest1() {
        assertTrue("AB101AA", instance.containsPostcode("Some text before AB101AA and after"));
    }

    @Test
    public void containsPostcodeTest2() {
        assertTrue("AL1 1AE", instance.containsPostcode("Some text before AL1 1AE and after"));
    }

    @Test
    public void containsPostcodeTest3() {
        assertTrue("B1  1AY", instance.containsPostcode("Some text before B1  1AY and after"));
    }

    @Test
    public void containsPostcodeTest4() {
        assertTrue("EC1A1AH", instance.containsPostcode("Some text before EC1A1AH and after"));
    }

    @Test
    public void standardizeTest1() {
        assertEquals("AB101AA", "AB10 1AA", instance.standardize("AB101AA"));
    }

    @Test
    public void standardizeTest2() {
        assertEquals("AL1 1AE", "AL1 1AE", instance.standardize("AL1 1AE"));
    }

    @Test
    public void standardizeTest3() {
        assertEquals("B1  1AY", "B1 1AY", instance.standardize("B1  1AY"));
    }

    @Test
    public void standardizeTest4() {
        assertEquals("EC1A1AH", "EC1A 1AH", instance.standardize("EC1A1AH"));
    }

}
