package uk.co.epii.spencerperceval.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * User: James Robinson
 * Date: 20/10/2013
 * Time: 18:44
 */
public class Group<T extends Groupable<T>> {

    private T common;
    private final List<T> group;

    public Group(T t) {
        common = t;
        group = new ArrayList<T>();
    }

    public T getCommon() {
        return common;
    }

    public Collection<T> getGroup() {
        return group;
    }

    public void add(T t) {
        common = common.getCommon(t);
        group.add(t);
    }

}
