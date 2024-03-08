package com.example.lab8;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list; /**
     * create a mocklist for my citylist * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>()); return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size
     plus one */
    @Test
    public void hasCityTest() {
        list = MockCityList();
        City newCity = new City("Regina", "SK");
        list.addCity(newCity);
        Assertions.assertTrue(list.hasCity(newCity));
    }

    @Test
    public void deleteCityTest() {
        list = MockCityList();
        City cityToDelete = new City("Moose Jaw", "SK");
        list.addCity(cityToDelete);
        assertTrue(list.hasCity(cityToDelete)); // Ensure city is added
        list.deleteCity(cityToDelete);
        assertFalse(list.hasCity(cityToDelete)); // Verify city is removed
    }







}
