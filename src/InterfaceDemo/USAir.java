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
public class USAir implements Airline
{

    public TicketPriceData getTicketPrice(String fromAirportCode, String toAirportCode,
            String departureDate, String returnDate, int numberAdult,
            int numberChildren, int felxDaysBefore, int flexDaysAfter,
            int searchCriteria, Object optionalData)
    {
        if (source.equals("Priceline")) {

            return calculateDiscountTicketPrice();

        }
        return calculateTicketPrice();
    }

    private TicketPriceData calculateTicketPrice()
    {
        TicketPriceData ourTicketPriceData;
        return ourTicketPriceData = new TicketPriceData(7.99);
    }

    public USAir(String isource)
    {
        this.source = isource;
    }
    String source = null;

    private TicketPriceData calculateDiscountTicketPrice()
    {
        TicketPriceData ourTicketPriceData;
        return ourTicketPriceData = new TicketPriceData(7.99 * .5);
    }

}
