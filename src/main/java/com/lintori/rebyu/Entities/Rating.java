package com.lintori.rebyu.Entities;

public class Rating {

    private final Integer id;
    private String movieTitle;
    private Integer rating;
    private String review;

    public Rating(Integer id, String movieTitle, Integer rating, String review) {
        this.id = id;
        this.movieTitle = movieTitle;
        this.rating = rating;
        this.review = review;
    }

    public Integer getId() {
        return id;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public boolean equals(Object compared){
        boolean output = false;
        if (this == compared){
            output = true;
        }
        if (!(compared instanceof Rating)){
            output = false;
        }
        Rating comparedRating = (Rating) compared;
        if (this.id == comparedRating.getId() &&
                this.movieTitle.equals(comparedRating.getMovieTitle()) &&
                this.rating == comparedRating.getRating() &&
                this.review.equals(comparedRating.getReview())
        ){
            output = true;
        }
        return output;
    }

}
