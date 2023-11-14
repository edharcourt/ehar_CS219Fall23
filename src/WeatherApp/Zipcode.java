package WeatherApp;

public class Zipcode {
    private String zipcode; // 5 digit zipcode
    private String state;   // two character state code
    private String city;

    private double lng, // longitude degrees west of PM
                   lat; // latitude degrees north of equator

    public Zipcode(String zipcode, String state,
                   String city, double lng, double lat) {
        this.zipcode = zipcode;
        this.state = state;
        this.city = city;
        this.lng = lng;
        this.lat = lat;
    }

    @Override
    public String toString() {
        return "Zipcode{" +
                "zipcode='" + zipcode + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", lng=" + lng +
                ", lat=" + lat +
                '}';
    }

    public String getZipcode() {
        return zipcode;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public double getLng() {
        return lng;
    }

    public double getLat() {
        return lat;
    }
}
