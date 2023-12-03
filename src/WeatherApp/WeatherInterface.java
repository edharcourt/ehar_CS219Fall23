package WeatherApp;

public interface WeatherInterface {
    double getCurrentTemp(Zipcode z);

    /**
     * In place of the getCurrentTemp function above,
     * implement the getCurrentWeather method so that it returns
     * a reference to a CurrentWeatherData object. Modify the
     * CurrentWeatherData class so that it contains the temperature
     * and the current relative humidity. Implement all appropriate
     * methods such as getters, constructor, and toString methods.
     *
     * Go to https://open-meteo.com/en/docs and see how you need to
     * modify the URL we used in getCurrentTemp to also get the current
     * humidity.
     *
     * Modify the main program accordingly to test your new function.
     *
     * @param z
     * @return
     */
    CurrentWeatherData getCurrentWeather(Zipcode z);
}
