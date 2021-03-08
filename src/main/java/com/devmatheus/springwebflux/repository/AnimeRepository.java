package com.devmatheus.springwebflux.repository;

import com.devmatheus.springwebflux.domain.Anime;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface AnimeRepository extends ReactiveCrudRepository<Anime, Integer> {

}
