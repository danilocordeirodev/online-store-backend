package com.oriedroc.onlinestorebackend.controller.dto.mapper;

import com.oriedroc.onlinestorebackend.controller.dto.request.StateRequest;
import com.oriedroc.onlinestorebackend.controller.dto.response.StateResponse;
import com.oriedroc.onlinestorebackend.entity.State;

import java.util.List;
import java.util.stream.Collectors;

public class StateMapper {

    public StateMapper() {

    }
    public static State toEntity(StateRequest stateRequest) {
        State state = new State();
        state.setName(stateRequest.getName());
        state.setUf(stateRequest.getUf());
        return state;
    }

    public static StateResponse toResponse(State state) {
        StateResponse stateResponse = new StateResponse();
        stateResponse.setId(state.getId());
        stateResponse.setUuid(state.getUuid());
        stateResponse.setName(state.getName());
        stateResponse.setUf(state.getUf());
        return stateResponse;
    }

    public static List<StateResponse> toResponseList(List<State> stateList) {
        return stateList
                .stream()
                .map(it -> toResponse(it))
                .collect(Collectors.toList());
    }
}
