package WeatherApp;

import java.util.ArrayList;
import java.util.Scanner;

import Util.Util;

// A class can implement multiple interfaces
public class ZipcodeDB implements ZipcodeDBInterface,
                                  WeatherInterface {

    private ArrayList<Zipcode> zips;

    public ZipcodeDB() {
        // load the zipcode database
        Scanner s = Util.openSite("http://10.32.10.70:8000/zips.txt");
        this.zips = new ArrayList<>();

        while (s.hasNextLine()) {
            String line = s.nextLine().trim();
            String [] parts = line.split(",");
            Zipcode z = new Zipcode(
                    parts[1].substring(1,parts[1].length() - 1),  // zipcode
                    parts[2].substring(1,parts[2].length() - 1),  // state
                    parts[3].substring(1,parts[3].length() - 1),  // city
                    Double.parseDouble(parts[4]),
                    Double.parseDouble(parts[5])
            );
            this.zips.add(z);
        }
    }  // constructor


   public Zipcode findByZip(String zip) {
        for (Zipcode z : this.zips)
            if (z.getZipcode().equals(zip))
                return z;

        return null;
    }

    public double getCurrentTemp(Zipcode z) {
        // https://api.open-meteo.com/v1/forecast?latitude=44.59&longitude=-75.16&current=temperature_2m&temperature_unit=fahrenheit&timezone=America%2FNew_York

        String path = "https://api.open-meteo.com/v1/forecast?latitude=" +
                      z.getLat() + "&longitude=" + -z.getLng() +
                      "&current=temperature_2m&temperature_unit=fahrenheit&timezone=America%2FNew_York";

        Scanner s = Util.openSite(path);
        String data = s.nextLine();
        //System.out.println(data);  // DEBUGGING AND TESTING

        // Extract the temperature value from data
        int start = data.indexOf("\"current\":");
        int end = data.indexOf('}', start);
        String blob = data.substring(start,end);
        start = blob.lastIndexOf(':');
        String temp = blob.substring(start+1);

        // TODO Extract the precipitation data
        // create a Current WeatherData object with
        // temp and precip data.

        return Double.parseDouble(temp);
    }

    @Override
    public CurrentWeatherData getCurrentWeather(Zipcode z) {
        return null;
    }
} // ZipcodeDB
