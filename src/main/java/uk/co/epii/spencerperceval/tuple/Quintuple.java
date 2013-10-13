package uk.co.epii.spencerperceval.tuple;

/**
 * User: James Robinson
 * Date: 30/09/2013
 * Time: 23:04
 */
public class Quintuple<F, S, T, G, H> {

    private F first;
    private S second;
    private T third;
    private G fourth;
    private H fifth;

    public Quintuple() {
        first = null;
        second = null;
        third = null;
        fourth = null;
        fifth = null;
    }

    public Quintuple(F first, S second, T third, G fourth, H fifth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
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

    public T getThird() {
        return third;
    }

    public void setThird(T third) {
        this.third = third;
    }

    public G getFourth() {
        return fourth;
    }

    public void setFourth(G fourth) {
        this.fourth = fourth;
    }

    public H getFifth() {
        return fifth;
    }

    public void setFifth(H fifth) {
        this.fifth = fifth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Quintuple quintuple = (Quintuple) o;

        if (fifth != null ? !fifth.equals(quintuple.fifth) : quintuple.fifth != null) return false;
        if (first != null ? !first.equals(quintuple.first) : quintuple.first != null) return false;
        if (fourth != null ? !fourth.equals(quintuple.fourth) : quintuple.fourth != null) return false;
        if (second != null ? !second.equals(quintuple.second) : quintuple.second != null) return false;
        if (third != null ? !third.equals(quintuple.third) : quintuple.third != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (second != null ? second.hashCode() : 0);
        result = 31 * result + (third != null ? third.hashCode() : 0);
        result = 31 * result + (fourth != null ? fourth.hashCode() : 0);
        result = 31 * result + (fifth != null ? fifth.hashCode() : 0);
        return result;
    }
}
