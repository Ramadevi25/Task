package com.itsm.timestamp;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tsclass {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private long timestamp;


    public Tsclass()
    {

    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }





}
