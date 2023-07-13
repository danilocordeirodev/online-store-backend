package com.oriedroc.onlinestorebackend.repository;

import com.oriedroc.onlinestorebackend.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {
    City findByUuid(UUID uuid);
}
