package com.oriedroc.onlinestorebackend.controller;

import com.oriedroc.onlinestorebackend.controller.dto.mapper.CityMapper;
import com.oriedroc.onlinestorebackend.controller.dto.mapper.StateMapper;
import com.oriedroc.onlinestorebackend.controller.dto.request.CityRequest;
import com.oriedroc.onlinestorebackend.controller.dto.request.StateRequest;
import com.oriedroc.onlinestorebackend.controller.dto.response.CityResponse;
import com.oriedroc.onlinestorebackend.controller.dto.response.StateResponse;
import com.oriedroc.onlinestorebackend.entity.City;
import com.oriedroc.onlinestorebackend.entity.State;
import com.oriedroc.onlinestorebackend.service.CityService;
import com.oriedroc.onlinestorebackend.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/city")
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping("/")
    public List<CityResponse> getAll() {
        CityMapper mapper = new CityMapper();
        return mapper.toResponseList(cityService.findAll());
    }

    @PostMapping("/")
    public City create(@RequestBody CityRequest request) {
        CityMapper mapper = new CityMapper();
        return cityService.save(mapper.toEntity(request));
    }

    @PutMapping("/{uuid}")
    public City update(@PathVariable("uuid") UUID uuid, @RequestBody CityRequest request) {
        CityMapper mapper = new CityMapper();
        return cityService.update(uuid, mapper.toEntity(request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        cityService.delete(id);
        return ResponseEntity.ok().build();
    }
}
