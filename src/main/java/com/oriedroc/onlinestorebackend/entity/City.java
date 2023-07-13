package com.oriedroc.onlinestorebackend.entity;

import com.oriedroc.onlinestorebackend.entity.base.BaseEntityAudit;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "cities")
@Getter
@Setter
public class City extends BaseEntityAudit {

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "state_id")
    private State state;

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\\' +
                '}' +
                super.toString();
    }

}
