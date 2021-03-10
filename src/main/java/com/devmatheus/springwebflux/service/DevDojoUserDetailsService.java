package com.devmatheus.springwebflux.service;

import com.devmatheus.springwebflux.repository.DevDojoUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class DevDojoUserDetailsService implements ReactiveUserDetailsService {

    private final DevDojoUserRepository devDojoUserRepository;

    @Override
    public Mono<UserDetails> findByUsername(String username) {
        return devDojoUserRepository.findByUsername(username)
                .cast(UserDetails.class);
    }
}
