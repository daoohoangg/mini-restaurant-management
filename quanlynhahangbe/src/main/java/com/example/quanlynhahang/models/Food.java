package com.example.quanlynhahang.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "food")
@Data
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long foodid;
    @Column(name = "tenmonan")
    private String foodname;
    @Column(name = "soluong")
    private long numoffood;
    @Column(name = "giathanh")
    private double priceoffood;
    @Column(name = "hansudung")
    private LocalDate expiredfoood;

    @OneToMany(mappedBy = "hoadon", fetch = FetchType.LAZY)
    @Transient
    private List<Bill> bills;
}
