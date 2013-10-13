package uk.co.epii.spencerperceval.tuple;

/**
 * User: James Robinson
 * Date: 30/09/2013
 * Time: 23:04
 */
public class Duple <F, S> {

    private F first;
    private S second;

    public Duple() {
        first = null;
        second = null;
    }

    public Duple(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public void setFirst(F first) {
        this.first = first;
    }

    public S getSecond() {
        return second;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Duple duple = (Duple) o;

        if (first != null ? !first.equals(duple.first) : duple.first != null) return false;
        if (second != null ? !second.equals(duple.second) : duple.second != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (second != null ? second.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Duple{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
