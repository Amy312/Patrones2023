package Practices.airportAbstractFactory;

import Practices.airport.Destination;
import Practices.airport.Origin;
import Practices.airport.Passenger;
import Practices.airport.Plane;

public class SolidaryTicket implements ITicket {
    private String flightNumber;
    private Practices.airport.Destination destination = new Practices.airport.Destination();
    private Practices.airport.Origin origin = new Practices.airport.Origin();
    private Practices.airport.Plane plane = new Practices.airport.Plane();
    private Practices.airport.Passenger passenger = new Practices.airport.Passenger();
    private String seatNumber;
    private String ticketCost;
    private String discount;
    private String discountReason;

    public SolidaryTicket(){}

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Practices.airport.Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public Practices.airport.Origin getOrigin() {
        return origin;
    }

    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    public Practices.airport.Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public Practices.airport.Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getTicketCost() {
        return ticketCost;
    }

    public void setTicketCost(String ticketCost) {
        this.ticketCost = ticketCost;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getDiscountReason() {
        return discountReason;
    }

    public void setDiscountReason(String discountReason) {
        this.discountReason = discountReason;
    }

    @Override
    public void showTicket() {
        System.out.println("--- Pasaje Solidario ---");
        System.out.println("- Número de vuelo: " + flightNumber);
        System.out.println("- Número de asiento: " + seatNumber);
        System.out.println("- Costo de pasaje: " + ticketCost);
        System.out.println("- Descuento: " + discount);
        System.out.println("- Motivo del descuento: " + discountReason);
        this.origin.showInfo();
        this.destination.showInfo();
        this.plane.showInfo();
        this.passenger.showInfo();
        System.out.println();


    }

    @Override
    public void changeData(String name, String ci, String seatNumber) {
        this.passenger.changeData(name, ci);
        setSeatNumber(seatNumber);
    }
}
