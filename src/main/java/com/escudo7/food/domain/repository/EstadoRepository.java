package com.escudo7.food.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.escudo7.food.domain.model.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {
}
