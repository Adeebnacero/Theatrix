package com.theatrix.repository;

import com.theatrix.domain.Movie;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by aubrey on 07/08/2017.
 */
public interface MovieRepository extends CrudRepository<Movie,Long> {

}
