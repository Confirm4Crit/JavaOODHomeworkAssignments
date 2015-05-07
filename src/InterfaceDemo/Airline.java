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
public interface Airline
{

    public TicketPriceData getTicketPrice(String fromAirportCode, String toAirportCode, String departureDate, String returnDate,
            int numberAdult, int numberChildren, int felxDaysBefore, int flexDaysAfter, int searchCriteria, Object optionalData
    );

}
