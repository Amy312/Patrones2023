package Practices.airportAbstractFactory;

import Practices.airport.Destination;
import Practices.airport.Origin;
import Practices.airport.Passenger;
import Practices.airport.Plane;

public class FactoryTicket {
    public static ITicket make(String ticketType){
        ITicket ticket;
        Destination destination = new Destination();
        Origin origin = new Origin();
        Plane plane = new Plane();
        Passenger passenger = new Passenger();

        switch (ticketType.toLowerCase()){
            case "childticket":
                ticket = new ChildTicket();

                ((ChildTicket) ticket).setFlightNumber("A123");
                ((ChildTicket) ticket).setSeatNumber("34B");
                ((ChildTicket) ticket).setSpecialTicketCost("Bs 103");

                destination.setCountry("Bolivia");
                destination.setCity("La Paz");
                destination.setAirport("Aeropuerto de El Alto");
                ((ChildTicket) ticket).setDestination(destination);

                origin.setCountry("Bolivia");
                origin.setCity("Cochabamba");
                origin.setAirport("Aeropuerto de Cochabamba");
                ((ChildTicket) ticket).setOrigin(origin);

                plane.setBrand("Suzuki");
                plane.setCapacity("1000 km/h");
                plane.setModel("Jeppy34-B");
                plane.setNumberOfSeats("120");
                ((ChildTicket) ticket).setPlane(plane);

                passenger.setName("Jose");
                passenger.setCi("9848176LP");
                ((ChildTicket) ticket).setPassenger(passenger);

                break;
            case "solidaryticket":
                ticket = new SolidaryTicket();

                ((SolidaryTicket) ticket).setFlightNumber("A120");
                ((SolidaryTicket) ticket).setSeatNumber("54A");
                ((SolidaryTicket) ticket).setTicketCost("Bs 300");
                ((SolidaryTicket) ticket).setDiscount("50%");
                ((SolidaryTicket) ticket).setDiscountReason("Error de Servicio");

                destination.setCountry("Bolivia");
                destination.setCity("La Paz");
                destination.setAirport("Aeropuerto de El Alto");
                ((SolidaryTicket) ticket).setDestination(destination);

                origin.setCountry("Perú");
                origin.setCity("Lima");
                origin.setAirport("Aeropuerto de Lima");
                ((SolidaryTicket) ticket).setOrigin(origin);

                plane.setBrand("Toyota");
                plane.setCapacity("1200 km/h");
                plane.setModel("ZB34-S");
                plane.setNumberOfSeats("250");
                ((SolidaryTicket) ticket).setPlane(plane);

                passenger.setName("Marco");
                passenger.setCi("12148176LP");
                ((SolidaryTicket) ticket).setPassenger(passenger);
                break;
            case "standardticket":
                ticket = new StandardTicket();

                ((StandardTicket) ticket).setFlightNumber("A122");
                ((StandardTicket) ticket).setSeatNumber("1A");
                ((StandardTicket) ticket).setTicketCost("Bs 300");


                destination.setCountry("Bolivia");
                destination.setCity("La Paz");
                destination.setAirport("Aeropuerto de El Alto");
                ((StandardTicket) ticket).setDestination(destination);

                origin.setCountry("Brasil");
                origin.setCity("Sao Paulo");
                origin.setAirport("Aeropuerto de Sao Paulo");
                ((StandardTicket) ticket).setOrigin(origin);

                plane.setBrand("Toyota");
                plane.setCapacity("1250 km/h");
                plane.setModel("AIR4-L");
                plane.setNumberOfSeats("150");
                ((StandardTicket) ticket).setPlane(plane);

                passenger.setName("Amy");
                passenger.setCi("6849613LP");
                ((StandardTicket) ticket).setPassenger(passenger);
                break;
            default:
                ticket = new StandardTicket();
                ((StandardTicket) ticket).setFlightNumber("A122");
                ((StandardTicket) ticket).setSeatNumber("1A");
                ((StandardTicket) ticket).setTicketCost("Bs 300");


                destination.setCountry("Bolivia");
                destination.setCity("La Paz");
                destination.setAirport("Aeropuerto de El Alto");
                ((StandardTicket) ticket).setDestination(destination);

                origin.setCountry("Brasil");
                origin.setCity("Sao Paulo");
                origin.setAirport("Aeropuerto de Sao Paulo");
                ((StandardTicket) ticket).setOrigin(origin);

                plane.setBrand("Toyota");
                plane.setCapacity("1250 km/h");
                plane.setModel("AIR4-L");
                plane.setNumberOfSeats("150");
                ((StandardTicket) ticket).setPlane(plane);

                passenger.setName("Amy");
                passenger.setCi("6849613LP");
                ((StandardTicket) ticket).setPassenger(passenger);
                break;
        }
        return ticket;
    }
}
