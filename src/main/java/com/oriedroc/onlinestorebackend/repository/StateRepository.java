package com.oriedroc.onlinestorebackend.repository;

import com.oriedroc.onlinestorebackend.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface StateRepository extends JpaRepository<State, Long> {
    State findByUuid(UUID uuid);
}
