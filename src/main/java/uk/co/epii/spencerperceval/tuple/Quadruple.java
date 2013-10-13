package uk.co.epii.spencerperceval.tuple;

/**
 * User: James Robinson
 * Date: 30/09/2013
 * Time: 23:04
 */
public class Quadruple<F, S, T, G> {

    private F first;
    private S second;
    private T third;
    private G fourth;

    public Quadruple() {
        first = null;
        second = null;
        third = null;
        fourth = null;
    }

    public Quadruple(F first, S second, T third, G fourth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Quadruple quadruple = (Quadruple) o;

        if (first != null ? !first.equals(quadruple.first) : quadruple.first != null) return false;
        if (fourth != null ? !fourth.equals(quadruple.fourth) : quadruple.fourth != null) return false;
        if (second != null ? !second.equals(quadruple.second) : quadruple.second != null) return false;
        if (third != null ? !third.equals(quadruple.third) : quadruple.third != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (second != null ? second.hashCode() : 0);
        result = 31 * result + (third != null ? third.hashCode() : 0);
        result = 31 * result + (fourth != null ? fourth.hashCode() : 0);
        return result;
    }
}
