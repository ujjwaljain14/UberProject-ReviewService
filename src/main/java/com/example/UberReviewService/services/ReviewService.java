package com.example.UberReviewService.services;

import com.example.uberprojectentityservice.models.Review;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public interface ReviewService {

    public Optional<Review> findReviewById(Long id);

    public List<Review> findAllReviews();

    public boolean deleteReviewById(Long id);

    public Review publishReview(Review review);

    public Review updateReview(Long id, Review review);

}