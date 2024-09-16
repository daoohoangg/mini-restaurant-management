package com.example.quanlynhahang.repository;

import com.example.quanlynhahang.models.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepo extends JpaRepository<Food,Long> {
}
