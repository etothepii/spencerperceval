package uk.co.epii.spencerperceval.util;

/**
 * User: James Robinson
 * Date: 20/10/2013
 * Time: 18:07
 */
public interface Groupable<T> {

    public int d(T t);
    public T getCommon(T t);
    public String getDifference(T t);

}
