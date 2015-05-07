/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PairTest;

import java.io.Serializable;
import java.util.Comparator;

/**
 *
 * @author Miles Robson
 * @param <K>
 * @param <V>
 */
public class Pair<K, V> implements Serializable, Cloneable, Comparable<K>
{

    private final K left;
    private final V right;

    public Pair(K f, V r)
    {
        this.left = f;
        this.right = r;
    }

    public K k()
    {
        return left;
    }

    public V v()
    {
        return right;
    }

    @Override
    public int hashCode()
    {
        return left.hashCode() + right.hashCode();
    }

    @Override
    public boolean equals(Object o)
    {
        Pair inputPair = (Pair) o;
        int result = this.hashCode();
        return result == o.hashCode();

    }

    public Pair<K, V> clone()
    {
        return new Pair<K, V>(left, right);
    }

    public String toString()
    {
        String result = null;
        result = left + " " + right;
        return result;
    }

    @Override
    public int compareTo(K t)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates. Couldn’t get 7.2 working
    }

}
