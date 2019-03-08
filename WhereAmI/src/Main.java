/*
 *
 * Simple application to show you approximately where you currently are
 * based on your IP address using GeoLite2 free database
 * This is done for Code Clinic Java exercises
 *
 */


import java.io.File;
import java.net.InetAddress;
import java.util.Scanner;
import com.maxmind.geoip2.*;
import com.maxmind.geoip2.model.CityResponse;
import com.maxmind.geoip2.record.City;
import com.maxmind.geoip2.record.Location;



public class Main {


    public static void main(String[] args) {

        String dbLocationTwo = "GeoLite2/GeoLite2-City.mmdb";

        File databaseTwo = new File(dbLocationTwo);

        DatabaseReader dbReader = createDatabase(databaseTwo);

        giveLocation(dbReader);


    }


    private static DatabaseReader createDatabase(File database) {

        try {
            DatabaseReader reader = new DatabaseReader.Builder(database).build();
            return reader;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }

    }

    private static void giveLocation(DatabaseReader reader) {

        System.out.println("Enter your IP address: ");
        Scanner sc = new Scanner(System.in);


        try {
            InetAddress ipAddress = InetAddress.getByName(sc.next());
            CityResponse response = reader.city(ipAddress);
            City city = response.getCity();
            Location location = response.getLocation();
            System.out.println("You are in or near the city of " + city.getName());
            System.out.println("Your approximate location on the map can be found at:");
            System.out.println("google.com.tr/maps/?q=" +
                    location.getLatitude() +
                    "," +
                    location.getLongitude());

        } catch (Exception e){
            System.out.println(e);
        }


    }

}
