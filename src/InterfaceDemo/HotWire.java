package InterfaceDemo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Miles Robson
 */
public class HotWire
{

    public static void main(String[] args)
    {
        Delta delta = new Delta();
        Airline usAir = new USAir("HotWire");
        Airline jetBlue = new JetBlue();

        TicketPriceData deltaPrice, usAirPrice, jetBluePrice = new TicketPriceData();

        deltaPrice = delta.getTicketPrice("23432", "gfdg", "dfgdg", "dfgfdg", 3, 3, 2, 3, 3, delta);
        usAirPrice = usAir.getTicketPrice("23432", "gfdg", "dfgdg", "dfgfdg", 3, 3, 2, 3, 3, delta);
        jetBluePrice = jetBlue.getTicketPrice("23432", "gfdg", "dfgdg", "dfgfdg", 3, 3, 2, 3, 3, delta);
        System.out.println("HotWire prices");

        System.out.println(deltaPrice.price);
        System.out.println(usAirPrice.price);
        System.out.println(jetBluePrice.price);
    }
}
