package devsathi.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){  //List<Movie> this provide list of class
        return movieRepository.findAll();
    }

    public Optional<Movie> singleMovie(String imdbId){
        return  movieRepository.findMovieByimdbId(imdbId);
    }
}
