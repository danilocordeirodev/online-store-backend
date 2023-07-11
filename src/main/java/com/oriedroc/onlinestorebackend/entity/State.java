package com.oriedroc.onlinestorebackend.entity;

import com.oriedroc.onlinestorebackend.entity.base.BaseEntityAudit;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "states")
@Data
public class State extends BaseEntityAudit {

    private String name;
    private String uf;

}
