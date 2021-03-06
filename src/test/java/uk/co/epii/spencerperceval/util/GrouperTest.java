package uk.co.epii.spencerperceval.util;

import edu.emory.mathcs.backport.java.util.Arrays;
import org.junit.Test;

import java.util.List;

import static junit.framework.Assert.assertEquals;

/**
 * User: James Robinson
 * Date: 26/10/2013
 * Time: 12:28
 */
public class GrouperTest {

    @Test
    public void groupTest1() {
        Grouper<DummyGroupable> grouper = new Grouper<DummyGroupable>();
        List<Group<DummyGroupable>> groups = grouper.group(Arrays.asList(new DummyGroupable[] {
                new DummyGroupable(5),
                new DummyGroupable(12),
                new DummyGroupable(19),
                new DummyGroupable(26),
                new DummyGroupable(33),
                new DummyGroupable(6),
                new DummyGroupable(13),
                new DummyGroupable(20),
                new DummyGroupable(27),
                new DummyGroupable(34),
                new DummyGroupable(41),
                new DummyGroupable(48)
            }
        ));
        assertEquals(2, groups.size());
        assertEquals(5, groups.get(0).size());
        assertEquals(7, groups.get(1).size());
        assertEquals(5, groups.get(0).getCommon().value);
        assertEquals(6, groups.get(1).getCommon().value);
    }

}
