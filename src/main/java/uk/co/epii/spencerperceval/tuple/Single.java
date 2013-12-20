package uk.co.epii.spencerperceval.tuple;

/**
 * User: James Robinson
 * Date: 30/09/2013
 * Time: 23:04
 */
public class Single <F> {

    private F first;

    public Single() {
        first = null;
    }

    public Single(F first) {
        this.first = first;
    }

    public F getFirst() {
        return first;
    }

    public void setFirst(F first) {
        this.first = first;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Single single = (Single) o;

        if (first != null ? !first.equals(single.first) : single.first != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = first != null ? first.hashCode() : 0;
        return result;
    }

    @Override
    public String toString() {
        return "Duple{" +
                "first=" + first +
                '}';
    }
}
