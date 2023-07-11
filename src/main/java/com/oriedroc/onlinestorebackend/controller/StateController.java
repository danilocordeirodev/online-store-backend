package com.oriedroc.onlinestorebackend.controller;

import com.oriedroc.onlinestorebackend.controller.dto.mapper.StateMapper;
import com.oriedroc.onlinestorebackend.controller.dto.request.StateRequest;
import com.oriedroc.onlinestorebackend.controller.dto.response.StateResponse;
import com.oriedroc.onlinestorebackend.entity.State;
import com.oriedroc.onlinestorebackend.service.StateService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/state")
public class StateController {

    @Autowired
    private StateService stateService;

    @GetMapping("/")
    public List<StateResponse> getAll() {
        StateMapper mapper = new StateMapper();
        return mapper.toResponseList(stateService.findAll());
    }

    @PostMapping("/")
    public State create(@RequestBody StateRequest stateRequest) {
        StateMapper mapper = new StateMapper();
        return stateService.save(mapper.toEntity(stateRequest));
    }

    @PutMapping("/{uuid}")
    public State update(@PathVariable("uuid") UUID uuid, @RequestBody StateRequest stateRequest) {
        StateMapper mapper = new StateMapper();
        return stateService.update(uuid, mapper.toEntity(stateRequest));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        stateService.delete(id);
        return ResponseEntity.ok().build();
    }
}
