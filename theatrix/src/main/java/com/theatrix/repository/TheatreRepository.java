package com.theatrix.repository;

import com.theatrix.domain.Theatre;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by aubrey on 05/11/2017.
 */
public interface TheatreRepository extends CrudRepository<Theatre, Long> {
}
