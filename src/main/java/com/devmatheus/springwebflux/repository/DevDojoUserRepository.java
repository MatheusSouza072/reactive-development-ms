package com.devmatheus.springwebflux.repository;

import com.devmatheus.springwebflux.domain.DevDojoUser;

public interface DevDojoUserRepository extends ReactiveCrudRepository<DevDojoUser, Integer> {

    Mono<DevDojoUser> findByUsername(String username);
}