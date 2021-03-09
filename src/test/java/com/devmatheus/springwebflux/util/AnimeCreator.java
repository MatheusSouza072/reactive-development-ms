package com.devmatheus.springwebflux.util;

import com.devmatheus.springwebflux.domain.Anime;

public class AnimeCreator {
    public static Anime createAnimeToBeSaved() {
        return Anime.builder()
                .name(("Tensei Shitara")).build();
    }

    public static Anime createValidAnime() {
        return Anime.builder()
                .id(1)
                .name(("Tensei Shitara")).build();
    }
    public static Anime createValidUpdatedAnime() {
        return Anime.builder()
                .id(1)
                .name(("Tensei Shitara 2")).build();
    }
}
