package com.example.quanlynhahang.controller;

import com.example.quanlynhahang.models.Account;
import com.example.quanlynhahang.repository.AccountRepo;
import com.example.quanlynhahang.services.AccountServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/accounts")
@CrossOrigin(origins = "http://localhost:3000")
public class AccountController {
    @Autowired
    AccountServices accountServices;

    @GetMapping("/views")
    public ResponseEntity<List<Account>> getAllAccountInfor(){
        return accountServices.viewAllAccounts();
    }

    @GetMapping("/findbyids")
    public ResponseEntity<Account> getAccountById(@RequestParam long id){
        return accountServices.findAccountById(id);
    }

    @PostMapping("/addaccount")
    public void addAccount(@RequestBody Account accinput){
        accountServices.createAccount(accinput);

//        for(Account x : accountRepo.findAll()){
//            if(accinput.getId() == x.getId() || accinput.getUsername().equalsIgnoreCase(x.getUsername())){
//                return new ResponseEntity<>(HttpStatus.CONFLICT);
//            }
//            else accountRepo.save(accinput.getId(),accinput.getUsername(),accinput.getPassword(),accinput.getAddress());
//        }
//        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @DeleteMapping("/deletaccount")
    public void deleteAccount(@RequestBody String username, String pass){
        accountServices.deleteAccount(username, pass);
    }

    @PutMapping("/changepassword")
    public void changePassword(@RequestBody String username, String pass, String newpass){
        accountServices.changePassword(username, pass, newpass);
    }
}
