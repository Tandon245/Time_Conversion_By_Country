package org.example;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {


    public static String convertTimeByCountry(String country) {
        ZoneId zoneId = ZoneId.of(countryToTimeZone(country)); //getting the zone id
        ZonedDateTime currentTime = ZonedDateTime.now(zoneId); //getting the current time accordingly
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        return currentTime.format(formatter);
    }

    //the below function will convert country to the time zone accordingly
    public static String countryToTimeZone(String country) {
        switch (country) {
            case "USA":
                return "America/New_York";
            case "UK":
                return "Europe/London";
            case "India":
                return "Asia/Kolkata";
            case "Japan":
                return "Asia/Tokyo";
            case "Canada":
                return "Canada/Eastern";
            case "Australia":
                return "Australia/Sydney";
            case "Germany":
                return "Europe/Berlin";
            case "Brazil":
                return "America/Sao_Paulo";
            case "China":
                return "Asia/Shanghai";
            case "South Africa":
                return "Africa/Johannesburg";
            default:
                throw new IllegalArgumentException("Unknown country: " + country);
        }
    }
    public static void main(String[] args) {



        String[] countries = {
                "USA",
                "UK",
                "India",
                "Japan",
                "Canada",
                "Australia",
                "Germany",
                "Brazil",
                "China",
                "South Africa"
        }; //you can get different country if you want

        for (String country : countries) {
            String convertedTime = convertTimeByCountry(country);
            System.out.println("Current time in " + country + ": " + convertedTime);
        }


    }
}