package WeatherApp;

public interface ZipcodeDBInterface {

    Zipcode findByZip(String zip);

    double getCurrentTemp(Zipcode z);

}
