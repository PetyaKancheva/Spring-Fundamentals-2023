package org.softuni.mobilele.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.softuni.mobilele.model.entity.BaseEntity;

import java.time.LocalDateTime;
@Entity
@Table(name= "brands")
public class BrandEntity extends BaseEntity {
    @Column(unique=true,nullable=false)
    private String name;
    @Column
    private LocalDateTime created;
    @Column
    private LocalDateTime modified;

    public BrandEntity (){
    }

    public String getName() {
        return name;
    }

    public BrandEntity setName(String name) {
        this.name = name;
        return this;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public BrandEntity setCreated(LocalDateTime created) {
        this.created = created;
        return this;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public BrandEntity setModified(LocalDateTime modified) {
        this.modified = modified;
        return this;
    }
}
