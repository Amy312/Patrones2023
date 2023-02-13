package Practices.airport;

public class Origin {
    //  origen (pais, ciudad, aeropuerto)

    private String country;
    private String city;
    private String airport;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    public void showInfo() {
        System.out.println("Origen: ");
        System.out.println("- País: " + country);
        System.out.println("- Ciudad: " + city);
        System.out.println("- Aeropuerto: " + airport);

    }
}
