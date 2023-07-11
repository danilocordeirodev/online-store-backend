package com.oriedroc.onlinestorebackend.entity.base;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseEntity implements Serializable {
    @Id
    @GeneratedValue
    @Column(unique = true, updatable = false, nullable = false)
    private Long id;

    @Column(unique = true, updatable = false, nullable = false)
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID uuid = UUID.randomUUID();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaseEntity)) return false;
        BaseEntity that = (BaseEntity) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "BaseEntity {" +
                "id = " + id +
                " uuid = " + uuid +
                "}";
    }
}
