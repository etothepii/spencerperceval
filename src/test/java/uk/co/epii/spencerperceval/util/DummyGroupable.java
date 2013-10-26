package uk.co.epii.spencerperceval.util;

import uk.co.epii.spencerperceval.util.Groupable;

/**
 * User: James Robinson
 * Date: 26/10/2013
 * Time: 12:30
 */
public class DummyGroupable implements Groupable<DummyGroupable> {

    public final int value;

    public DummyGroupable(int value) {
        this.value = value;
    }

    @Override
    public int d(DummyGroupable s) {
        int d = (this.value - s.value) % 7;
        return d == 0 ? 1 : 2;
    }

    @Override
    public DummyGroupable getCommon(DummyGroupable s) {
        if (d(s) == 1) {
            int common = value % 7;
            return new DummyGroupable(common < 0 ? common + 7 : common);
        }
        throw new IllegalArgumentException("These numbers do not belong in the same group");
    }

    @Override
    public String getDifference(DummyGroupable s) {
        if (d(s) == 1) {
            return (this.value - s.value) + "";
        }
        throw new IllegalArgumentException("These numbers do not belong in the same group");
    }

    @Override
    public String toString() {
        return "DummyGroupable{" +
                "value=" + value +
                '}';
    }
}
