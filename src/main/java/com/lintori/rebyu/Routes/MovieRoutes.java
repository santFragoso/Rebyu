package com.lintori.rebyu.Routes;

import com.lintori.rebyu.Entities.Movie;
import com.lintori.rebyu.Entities.User;
import com.lintori.rebyu.Generic.Date;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/movies")
public class MovieRoutes {

    @GetMapping()
    public ArrayList<Movie> getAllMovies() {
        ArrayList<Movie> allMovies = new ArrayList<>();
        allMovies.add(new Movie(
                1,
                "title",
                new User(
                        1,
                        "Mario25",
                        "Mario",
                        "Chan",
                        "profile picture",
                        "email"),
                new Date(
                        2018,
                        11,
                        15
                ),
                new Date(
                        2020,
                        10,
                        15
                )
        ));
        return allMovies;
    }

    @GetMapping("/{id}")
    public Movie getMovie(
            @PathVariable(value="id") int requestID
    ) {
        return new Movie(
                1,
                "title",
                new User(
                        1,
                        "Mario25",
                        "Mario",
                        "Chan",
                        "profile picture",
                        "email"),
                new Date(
                        2018,
                        11,
                        15
                ),
                new Date(
                        2020,
                        10,
                        15
                )
        );
    }

    @PostMapping()
    public void postMovie(
            @RequestBody Movie requestMovie
    ) {

    }

    @PutMapping("/{id}")
    public void putMovie(
            @PathVariable(value="id") int requestID
    ) {

    }

    @DeleteMapping("/{id}")
    public void deleteMovie(
            @PathVariable(value="id") int requestID
    ) {

    }

}
