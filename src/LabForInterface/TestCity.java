package LabForInterface;

import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class TestCity {

    public static void main(String[] args) {

        City city1 = new City ("AA",50);
        City city2 = new City("MN",60);
        City city3 = new City("FF",45);
        City city4 = new City("SP",40);

        List <City> cities = new ArrayList<City>();
        cities.add(city1);
        cities.add(city2);
        cities.add(city3);
        cities.add(city4);


        Collections.sort(cities);
        //System.out.println(cities);
        for( City i: cities){
            System.out.println(i);
        }
    }
}
