/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QueueAssignment;

import java.util.Collection;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 *
 * @author Miles Robson
 * @param <E>
 */
public class LQueue<E> implements MyQueue
{

    private LinkedList<E> oList = new LinkedList();

    LQueue()
    {

    }

    @Override
    public Object head()
    {
        if (oList.peekFirst() != null) {
            return oList.element();
        } else {
            throw new NoSuchElementException("No Such Element exists");
        }
    }

    @Override
    public Object dequeue()
    {
        if (oList.peekFirst() != null) {
            return oList.pollFirst();
        } else {
            throw new NoSuchElementException("No Such Element exists");
        }
    }

    @Override
    public void enqueue(Object e)
    {
        oList.addLast((E) e);
    }

    @Override
    public int size()
    {
        return oList.size();
    }

    @Override
    public boolean isEmpty()
    {
        return oList.isEmpty();
    }

    @Override
    public void addAll(Collection E)
    {
        oList.addAll(E);
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
}
