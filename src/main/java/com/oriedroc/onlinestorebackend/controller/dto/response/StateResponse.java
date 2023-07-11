package com.oriedroc.onlinestorebackend.controller.dto.response;

import lombok.Data;

import java.util.UUID;

@Data
public class StateResponse {
    public Long id;
    public UUID uuid;
    public String name;
    public String uf;
}
