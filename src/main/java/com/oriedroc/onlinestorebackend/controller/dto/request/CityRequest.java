package com.oriedroc.onlinestorebackend.controller.dto.request;

import com.oriedroc.onlinestorebackend.entity.State;
import lombok.Data;

@Data
public class CityRequest {
    String name;
    State state;
}
