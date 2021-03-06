
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ListIterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author original
 */
public class Country {
    private int id;
    private String name;
    private int numberOfCities;
    private List<City> cities ;
            
    public Country(int id, String name, int numberOfCities) {
        this.id = id;
        this.name = name;
        this.numberOfCities = numberOfCities;
        this.cities = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfCities() {
        return numberOfCities;
    }

    public void setNumberOfCities(int numberOfCities) {
        this.numberOfCities = numberOfCities;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(City city) {      
       if(cities.isEmpty())
           cities.add(city);
       else
       {
            for(int i =0 ; i<cities.size() ;i++)
            {
                if (city.getPopultion()>= cities.get(i).getPopultion())
                {
                   cities.add(i, city);
                   break;
                }
           }          
       }
    }
}
