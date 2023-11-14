package WeatherApp;

import java.util.ArrayList;
import java.util.Scanner;

import Util.Util;

public class ZipcodeDB implements ZipcodeDBInterface {

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


    @Override
    public Zipcode findByZip(String zip) {
        for (Zipcode z : this.zips)
            if (z.getZipcode().equals(zip))
                return z;

        return null;
    }

    @Override
    public double getCurrentTemp(Zipcode z) {
        return 0;
    }
} // ZipcodeDB
