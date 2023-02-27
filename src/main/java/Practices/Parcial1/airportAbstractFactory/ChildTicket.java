package Practices.Parcial1.airportAbstractFactory;

import Practices.Parcial1.airport.Destination;
import Practices.Parcial1.airport.Origin;
import Practices.Parcial1.airport.Passenger;
import Practices.Parcial1.airport.Plane;

public class ChildTicket implements ITicket {
    private String flightNumber;
    private Practices.Parcial1.airport.Destination destination = new Practices.Parcial1.airport.Destination();
    private Practices.Parcial1.airport.Origin origin = new Practices.Parcial1.airport.Origin();
    private Practices.Parcial1.airport.Plane plane = new Practices.Parcial1.airport.Plane();
    private Practices.Parcial1.airport.Passenger passenger = new Practices.Parcial1.airport.Passenger();
    private String seatNumber;
    private String specialTicketCost;

    public ChildTicket(){}

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Practices.Parcial1.airport.Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public Practices.Parcial1.airport.Origin getOrigin() {
        return origin;
    }

    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    public Practices.Parcial1.airport.Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public Practices.Parcial1.airport.Passenger getPassenger() {
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

    public String getSpecialTicketCost() {
        return specialTicketCost;
    }

    public void setSpecialTicketCost(String specialTicketCost) {
        this.specialTicketCost = specialTicketCost;
    }

    @Override
    public void showTicket() {
        System.out.println("--- Pasaje Infantil ---");
        System.out.println("- Número de vuelo: " + flightNumber);
        System.out.println("- Número de asiento: " + seatNumber);
        System.out.println("- Costo de pasaje especial: " + specialTicketCost);
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
