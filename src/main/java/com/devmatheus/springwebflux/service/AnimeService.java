package com.devmatheus.springwebflux.service;

import com.devmatheus.springwebflux.domain.Anime;
import com.devmatheus.springwebflux.repository.AnimeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class AnimeService {

private final AnimeRepository animeRepository;
    public Flux<Anime> findAll() {
        return animeRepository.findAll();
    }
    public Mono<Anime> findById(int id) {
        return animeRepository.findById(id);

    }

}
