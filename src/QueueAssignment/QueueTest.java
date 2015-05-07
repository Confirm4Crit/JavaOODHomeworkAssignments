/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QueueAssignment;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Miles Robson
 */
public class QueueTest
{

    public static void main(String[] args)
    {
        LQueue<Integer> myList = new LQueue<>();
        ArrayList myList2 = new ArrayList<>();
        LQueue<Integer> exceptionTest = new LQueue<>();
        System.out.println(myList.isEmpty()); //true
        System.out.println(myList.size()); //0
        myList.enqueue(3);
        System.out.println(myList.size());//1

        System.out.println(myList.isEmpty());//false

        System.out.println(myList.head());//3

        myList.dequeue();
        System.out.println(myList.size());//0

        myList.enqueue(3);
        myList.enqueue(4);
        myList.enqueue(5);
        myList2.add(3);
        myList2.add(4);
        myList2.add(5);
        myList.addAll(myList2);
        System.out.println(myList.size());//6
        System.out.println(exceptionTest.head());//exception error

    }

}
