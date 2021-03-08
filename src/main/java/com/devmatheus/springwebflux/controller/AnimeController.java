package com.devmatheus.springwebflux.controller;

import com.devmatheus.springwebflux.domain.Anime;
import com.devmatheus.springwebflux.repository.AnimeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
@RestController
@RequestMapping("animes")
public class AnimeController {
    private final AnimeRepository animeRepository;

    @GetMapping
    public Flux<Anime> listAll() {
        return animeRepository.findAll();
    }
}
