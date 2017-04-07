package com.example;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

/**
 * Created by SDA on 07.04.2017.
 */
public interface FightRepository extends JpaRepository<Fight, Long> {
    Collection<Fight> findByResult(String result);

    Fight findById(long id);
}
