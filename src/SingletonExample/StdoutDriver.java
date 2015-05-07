/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingletonExample;

/**
 *
 * @author Miles Robson
 */
public class StdoutDriver
{

    public static void main(String[] args)
    {
        Stdout.getInstance().printline("Hello");
        Stdout.getInstance().printline("I am a program");
        Stdout.getInstance().printline("Hello");
    }

}
