package WeatherApp;

public class CurrentWeatherData {
    private double temp;
    private double precip;

    public CurrentWeatherData(double temp, double precip) {
        this.temp = temp;
        this.precip = precip;
    }

    @Override
    public String toString() {
        return "CurrentWeatherData{" +
                "temp=" + temp +
                ", precip=" + precip +
                '}';
    }

    public double getTemp() {
        return temp;
    }

    public double getPrecip() {
        return precip;
    }
}
