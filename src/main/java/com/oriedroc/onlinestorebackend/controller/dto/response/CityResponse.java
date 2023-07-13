package com.oriedroc.onlinestorebackend.controller.dto.response;

import lombok.Data;

import java.util.UUID;

@Data
public class CityResponse {
    public Long id;
    public UUID uuid;
    public String name;
}
