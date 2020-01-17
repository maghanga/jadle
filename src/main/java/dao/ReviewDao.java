package dao;

import models.Review;
import java.util.List;

public interface ReviewDao {

    void add(Review review);

    List<Review> getAll();
    List<Review> getAllReviewsByRestaurant(int restaurantId);

    void deleteById(int id);
    void clearAll();
}