package Practices.airport;

public class SolidarityTicketCreator extends CreatorTicket {
    @Override
    public SolidarityTicket create() {
        SolidarityTicket ticket = new SolidarityTicket();
        ticket.setFlightNumber("A120");
        ticket.setSeatNumber("54A");
        ticket.setTicketCost("Bs 300");
        ticket.setDiscount("50%");
        ticket.setDiscountReason("Error de Servicio");

        Destination destination = new Destination();
        destination.setCountry("Bolivia");
        destination.setCity("La Paz");
        destination.setAirport("Aeropuerto de El Alto");
        ticket.setDestination(destination);

        Origin origin = new Origin();
        origin.setCountry("Perú");
        origin.setCity("Lima");
        origin.setAirport("Aeropuerto de Lima");
        ticket.setOrigin(origin);

        Plane plane = new Plane();
        plane.setBrand("Toyota");
        plane.setCapacity("1200 km/h");
        plane.setModel("ZB34-S");
        plane.setNumberOfSeats("250");
        ticket.setPlane(plane);

        Passenger passenger = new Passenger();
        passenger.setName("Marco");
        passenger.setCi("12148176LP");
        ticket.setPassenger(passenger);

        return ticket;
    }
}
