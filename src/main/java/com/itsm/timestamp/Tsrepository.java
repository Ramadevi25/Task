package com.itsm.timestamp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Tsrepository extends JpaRepository<Tsclass,Integer> {
}
