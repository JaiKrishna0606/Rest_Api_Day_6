package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.BabyModel;

public interface BabyRepo extends JpaRepository<BabyModel, Integer> {

}
