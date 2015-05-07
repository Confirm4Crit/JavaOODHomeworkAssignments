/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PairTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Miles Robson
 */
public class PairDriver
{

    public static void main(String[] args)
    {
        Pair<Integer, String> p = new Pair<>(1, "one");
        System.out.println(p.toString());//1 one
        System.out.println(p.hashCode());//hashCode equals
        Pair<Integer, String> q = p.clone();
        System.out.println(q.hashCode());//hashCode equals
        System.out.println(q.k() + " " + q.v());//1 one
        System.out.println(q.equals(p));//true

        //Serialization Test
        try {
            FileOutputStream fileOut = new FileOutputStream("pair.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(q);
            out.close();
            fileOut.close();
        } catch (IOException i) {
            i.printStackTrace();
        }

        Pair<Integer, String> testSer = null;
        try {
            FileInputStream fileIn = new FileInputStream("pair.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            testSer = (Pair) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
            return;
        }
        System.out.println(testSer.equals(q)); //true

    }
}
