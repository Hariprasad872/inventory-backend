package com.example.demo.repository;

import com.example.demo.model.StoreOpening;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreOpeningRepository extends JpaRepository<StoreOpening, Long> {
}