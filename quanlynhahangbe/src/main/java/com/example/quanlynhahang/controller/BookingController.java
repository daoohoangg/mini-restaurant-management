package com.example.quanlynhahang.controller;

import com.example.quanlynhahang.services.BillServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bills")
@CrossOrigin(origins = "http://localhost:3000")
public class BookingController {
    @Autowired
    BillServices billServices;

}
