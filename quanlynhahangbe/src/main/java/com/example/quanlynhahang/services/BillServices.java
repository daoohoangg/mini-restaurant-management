package com.example.quanlynhahang.services;

import com.example.quanlynhahang.repository.BillRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillServices {
    @Autowired
    BillRepo billRepo;
}
