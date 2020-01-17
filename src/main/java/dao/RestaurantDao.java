package dao;

import models.Restaurant;
import java.util.List;

public interface RestaurantDao {

    void add (Restaurant restaurant);
    // void addRestaurantToFoodType(Restaurant restaurant, Foodtype foodtype)

    List<Restaurant> getAll();
    Restaurant findById(int id);
    // List<Foodtype> getAllFoodtypesForARestaurant(int restaurantId);

    void update(int id, String name, String address, String zipcode, String phone, String website, String email);

    void deleteById(int id);
    void clearAll();
}