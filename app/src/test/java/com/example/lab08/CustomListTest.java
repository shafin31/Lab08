package com.example.lab08;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
    // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        assertEquals(1, list.countCities());
        list.deleteCity(calgary);
        assertEquals(0, list.countCities());

    }

    @Test
    public void testCountCities() {
        CustomList cityList = new CustomList();
        assertEquals(0, cityList.countCities());

        City edmonton = new City("Edmonton", "Alberta");
        City calgary = new City("Calgary", "Alberta");

        cityList.addCity(edmonton);
        cityList.addCity(calgary);
        assertEquals(2, cityList.countCities());

        cityList.deleteCity(edmonton);
        assertEquals(1, cityList.countCities());
    }



}
