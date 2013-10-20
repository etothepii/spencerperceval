package uk.co.epii.spencerperceval.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * User: James Robinson
 * Date: 20/10/2013
 * Time: 19:09
 */
public class Grouper<T extends Groupable<T>> {

    private GroupRelation<T> groupRelation;
    private List<Group<T>> groups;

    public Grouper() {
        this(new GroupRelation<T>() {
            @Override
            public boolean equivalent(T a, T b) {
                    return a.d(b) == 1;
            }
        });
    }

    public Grouper(GroupRelation<T> groupRelation) {
        this.groupRelation = groupRelation;
    }

    public List<Group<T>> group(Collection<T> collection) {
        groups = new ArrayList<Group<T>>();
        for (T t : collection) {
            group(t);
        }
        return groups;
    }

    private void group(T t) {
        for (Group<T> group : groups) {
            if (groupRelation.equivalent(group.getCommon(), t)) {
                group.add(t);
                break;
            }
        }
        groups.add(new Group<T>(t));
    }

}
