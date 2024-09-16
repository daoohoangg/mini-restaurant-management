package com.example.quanlynhahang.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tables")
@Data
public class Tables {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tableid")
    private long tableid;
    @Column(name = "kyhieuban")
    private String numberoftable;
    @Column(name = "trangthaiban")
    private boolean tablestatus;


}
