
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author original
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        CityDAO cityDAO = new CityDAO();
        List<String> citiesLines= cityDAO.readDataFromCSV("city");
        List<City> cities = cityDAO.createCities(citiesLines);
        
        
        
        CountryDAO countryDAO = new CountryDAO();
        List<String> countryLines = countryDAO.readDataFromCSV("country");
        List<Country> countries = countryDAO.createCities(countryLines);
        
       //set of country in cities
       cityDAO.setCountryInCity(cities, countries);
       
       cityDAO.setCitiesOfCountry(cities, countries);
       
        
       
        Map<String, List<City>> map = new HashMap();
        countries.forEach(country -> {
            map.put(country.getName(),country.getCities());
        }); 
        
        map.forEach((k, v) -> 
            System.out.println("Country Name =" + k + ", Cities with sorted =" + v));
    }
  
}
