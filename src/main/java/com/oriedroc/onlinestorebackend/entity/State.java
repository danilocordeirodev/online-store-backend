package com.oriedroc.onlinestorebackend.entity;

import com.oriedroc.onlinestorebackend.entity.base.BaseEntityAudit;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "states")
@Getter
@Setter
public class State extends BaseEntityAudit {

    @Column(name = "name")
    private String name;

    @Column(name = "uf")
    private String uf;

    @Override
    public String toString() {
        return "State{" +
                "name='" + name + '\\' +
                ", uf='" + uf + '\\' +
                '}' +
                super.toString();
    }

}
