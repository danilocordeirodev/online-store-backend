package com.oriedroc.onlinestorebackend.service;

import com.oriedroc.onlinestorebackend.entity.City;
import com.oriedroc.onlinestorebackend.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CityService {
    @Autowired
    private CityRepository cityRepository;

    public List<City> findAll() {
        return cityRepository.findAll();
    }
    public City save(City city) {
        return cityRepository.saveAndFlush(city);
    }

    public City update(UUID uuid, City city) {
        City cityFound = cityRepository.findByUuid(uuid);
        cityFound.setName(city.getName());
        return cityRepository.saveAndFlush(cityFound);
    }

    public void delete(Long id) {
        City city =  cityRepository.findById(id).get();
        cityRepository.delete(city);
    }

    public City getByUuid(UUID uuid) {
        return cityRepository.findByUuid(uuid);
    }
}
