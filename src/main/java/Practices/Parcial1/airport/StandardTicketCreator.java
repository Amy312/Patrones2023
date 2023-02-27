package Practices.Parcial1.airport;

public class StandardTicketCreator extends CreatorTicket{
    @Override
    public StandardTicket create() {
        StandardTicket ticket = new StandardTicket();
        ticket.setFlightNumber("A122");
        ticket.setSeatNumber("1A");
        ticket.setTicketCost("Bs 300");


        Destination destination = new Destination();
        destination.setCountry("Bolivia");
        destination.setCity("La Paz");
        destination.setAirport("Aeropuerto de El Alto");
        ticket.setDestination(destination);

        Origin origin = new Origin();
        origin.setCountry("Brasil");
        origin.setCity("Sao Paulo");
        origin.setAirport("Aeropuerto de Sao Paulo");
        ticket.setOrigin(origin);

        Plane plane = new Plane();
        plane.setBrand("Toyota");
        plane.setCapacity("1250 km/h");
        plane.setModel("AIR4-L");
        plane.setNumberOfSeats("150");
        ticket.setPlane(plane);

        Passenger passenger = new Passenger();
        passenger.setName("Amy");
        passenger.setCi("6849613LP");
        ticket.setPassenger(passenger);

        return ticket;
    }
}
