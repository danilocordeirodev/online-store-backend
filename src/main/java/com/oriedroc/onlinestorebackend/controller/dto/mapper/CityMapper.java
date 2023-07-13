package com.oriedroc.onlinestorebackend.controller.dto.mapper;

import com.oriedroc.onlinestorebackend.controller.dto.request.CityRequest;
import com.oriedroc.onlinestorebackend.controller.dto.request.StateRequest;
import com.oriedroc.onlinestorebackend.controller.dto.response.CityResponse;
import com.oriedroc.onlinestorebackend.controller.dto.response.StateResponse;
import com.oriedroc.onlinestorebackend.entity.City;
import com.oriedroc.onlinestorebackend.entity.State;

import java.util.List;
import java.util.stream.Collectors;

public class CityMapper {

    public CityMapper() {

    }
    public static City toEntity(CityRequest request) {
        City city = new City();
        city.setName(request.getName());
        city.setState(request.getState());
        return city;
    }

    public static CityResponse toResponse(City city) {
        CityResponse cityResponse = new CityResponse();
        cityResponse.setId(city.getId());
        cityResponse.setUuid(city.getUuid());
        cityResponse.setName(city.getName());
        return cityResponse;
    }

    public static List<CityResponse> toResponseList(List<City> cityList) {
        return cityList
                .stream()
                .map(it -> toResponse(it))
                .collect(Collectors.toList());
    }
}
