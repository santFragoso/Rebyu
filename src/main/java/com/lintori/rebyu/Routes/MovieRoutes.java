package com.lintori.rebyu.Routes;

import com.lintori.rebyu.Entities.Movie;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/movies")
public class MovieRoutes {

    @GetMapping()
    public ArrayList<Movie> getAllMovies() {
        ArrayList<Movie> allMovies = new ArrayList<>();
        allMovies.add(new Movie());
        return allMovies;
    }

    @GetMapping("/{id}")
    public Movie getMovie(
            @PathVariable(value="id") int requestID
    ) {
        return new Movie();
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
