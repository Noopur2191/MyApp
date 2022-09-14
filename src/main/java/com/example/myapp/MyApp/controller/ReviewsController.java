package com.example.myapp.MyApp.controller;

import com.example.myapp.MyApp.Model.Reviews;
import com.example.myapp.MyApp.repository.ReviewRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/reviews/api/v1")
public class ReviewsController {

    private final ReviewRepository reviewRepository;

    public ReviewsController(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }


    //getReviews
    @GetMapping()
    private List<Reviews> getReviews(){
        return this.reviewRepository.findAll();
    }

    //getReviewById
    //saveReview
    //updateReview
    //deleteReview

}
