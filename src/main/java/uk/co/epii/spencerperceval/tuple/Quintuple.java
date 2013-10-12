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
}
