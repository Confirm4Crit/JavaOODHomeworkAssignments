/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingletonExample;

import sun.security.util.Debug;

/**
 *
 * @author Miles Robson
 */
public class Stdout
{

    private String name;

    private Stdout()
    {
        //name = "Test to show this is all the same instance 1231232";
    }

    private static Stdout ourInstance = new Stdout();

    public void printline(String s)
    {
        System.out.println(name);
        System.out.println(s);
    }

    public static Stdout getInstance()
    {
        return ourInstance;
    }

}
