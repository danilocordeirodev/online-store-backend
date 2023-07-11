package com.oriedroc.onlinestorebackend.service;

import com.oriedroc.onlinestorebackend.entity.State;
import com.oriedroc.onlinestorebackend.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class StateService {
    @Autowired
    private StateRepository stateRepository;

    public List<State> findAll() {
        return stateRepository.findAll();
    }
    public State save(State state) {
        return stateRepository.saveAndFlush(state);
    }

    public State update(UUID uuid, State state) {
        State stateFound = stateRepository.findByUuid(uuid);
        stateFound.setName(state.getName());
        stateFound.setUf(state.getUf());
        return stateRepository.saveAndFlush(stateFound);
    }

    public void delete(Long id) {
        State state =  stateRepository.findById(id).get();
        stateRepository.delete(state);
    }

    public State getByUuid(UUID uuid) {
        return stateRepository.findByUuid(uuid);
    }
}
