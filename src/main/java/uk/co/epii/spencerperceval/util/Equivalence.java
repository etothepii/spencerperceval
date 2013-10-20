package uk.co.epii.spencerperceval.util;

import uk.co.epii.spencerperceval.tuple.Duple;

import java.util.List;
import java.util.Map;

/**
 * User: James Robinson
 * Date: 14/10/2013
 * Time: 19:23
 */
public interface Equivalence<T, S> {

    public Map<T, S> match(List<T> t, List<S> s);

}
