package com.example.quanlynhahang.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.quanlynhahang.models.Tables;
import org.springframework.stereotype.Repository;

@Repository
public interface TableRepo extends JpaRepository<Tables,Long> {
}
