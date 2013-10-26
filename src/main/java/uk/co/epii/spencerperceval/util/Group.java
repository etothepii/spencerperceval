package uk.co.epii.spencerperceval.util;

import java.util.*;

/**
 * User: James Robinson
 * Date: 20/10/2013
 * Time: 18:44
 */
public class Group<T extends Groupable<T>> implements List<T> {

    private T common;
    private final List<T> group;

    public Group(T t) {
        common = t;
        group = new ArrayList<T>();
        group.add(t);
    }

    public T getCommon() {
        return common;
    }

    @Override
    public int size() {
        return group.size();
    }

    @Override
    public boolean isEmpty() {
        return group.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return group.contains(o);
    }

    @Override
    public Iterator<T> iterator() {
        return group.iterator();
    }

    @Override
    public Object[] toArray() {
        return group.toArray();
    }

    @Override
    public <T1 extends Object> T1[] toArray(T1[] a) {
        return group.toArray(a);
    }

    @Override
    public boolean add(T t) {
        common = common.getCommon(t);
        return group.add(t);
    }

    @Override
    public boolean remove(Object o) {
        return group.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return group.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        boolean change = false;
        for (T t : c) {
            change |= add(t);
        }
        return change;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        throw new UnsupportedOperationException("This method is not supported");
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return group.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return group.retainAll(c);
    }

    @Override
    public void clear() {
        group.clear();
        common = null;
    }

    @Override
    public T get(int index) {
        return group.get(index);
    }

    @Override
    public T set(int index, T element) {
        return group.set(index, element);
    }

    @Override
    public void add(int index, T element) {
        group.add(index, element);
    }

    @Override
    public T remove(int index) {
        return group.remove(index);
    }

    @Override
    public int indexOf(Object o) {
        return group.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return group.lastIndexOf(o);
    }

    @Override
    public ListIterator<T> listIterator() {
        return group.listIterator();
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return group.listIterator(index);
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return group.subList(fromIndex, toIndex);
    }

}
