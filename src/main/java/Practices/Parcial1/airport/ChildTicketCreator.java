package Practices.Parcial1.airport;

public class ChildTicketCreator extends CreatorTicket {

    @Override
    public ChildTicket create() {
        ChildTicket ticket = new ChildTicket();
        ticket.setFlightNumber("A123");
        ticket.setSeatNumber("34B");
        ticket.setSpecialTicketCost("Bs 103");

        Destination destination = new Destination();
        destination.setCountry("Bolivia");
        destination.setCity("La Paz");
        destination.setAirport("Aeropuerto de El Alto");
        ticket.setDestination(destination);

        Origin origin = new Origin();
        origin.setCountry("Bolivia");
        origin.setCity("Cochabamba");
        origin.setAirport("Aeropuerto de Cochabamba");
        ticket.setOrigin(origin);

        Plane plane = new Plane();
        plane.setBrand("Suzuki");
        plane.setCapacity("1000 km/h");
        plane.setModel("Jeppy34-B");
        plane.setNumberOfSeats("120");
        ticket.setPlane(plane);

        Passenger passenger = new Passenger();
        passenger.setName("Jose");
        passenger.setCi("9848176LP");
        ticket.setPassenger(passenger);

        return ticket;
    }
}
