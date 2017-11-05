package com.theatrix.repository;

import com.theatrix.domain.Show;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by aubrey on 09/09/2017.
 */
public interface ShowRepository extends CrudRepository<Show, Long> {
}
