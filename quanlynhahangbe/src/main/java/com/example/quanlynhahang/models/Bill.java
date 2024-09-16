package com.example.quanlynhahang.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "hoadon")
@Data
public class Bill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "thoigiantaohoadon")
    private LocalDate timecreated;
    @Column(name = "tongtien")
    private double totalprice;

    @ManyToOne
    @JoinColumn(name = "accid")
    private Account accounts;

    @ManyToOne
    @JoinColumn(name = "foodid")
    private Food foods;
}
