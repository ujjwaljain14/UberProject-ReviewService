package com.example.UberReviewService.adapters;

import com.example.UberReviewService.dtos.ReviewDto;
import com.example.uberprojectentityservice.models.Review;

public interface ReviewToReviewDtoAdapter {

    public ReviewDto convertReviewToReviewDto(Review review);
}
