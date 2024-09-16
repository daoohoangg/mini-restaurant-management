package com.example.quanlynhahang.services;

import com.example.quanlynhahang.models.Account;
import com.example.quanlynhahang.repository.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class AccountServices {
    @Autowired
    AccountRepo accountRepo;

//    xem toan bo account
    public ResponseEntity<List<Account>> viewAllAccounts(){
        try{
            List<Account> acc = new ArrayList<>();
            for(Account x : accountRepo.findAll()){
                acc.add(x);
            }
            return new ResponseEntity<>(acc, HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
//    tim kiem account theo id
    public ResponseEntity<Account> findAccountById(long id){
        Optional<Account> acc = accountRepo.findById(id);
        if(acc.isEmpty()){
            return new ResponseEntity<>(null,HttpStatus.NO_CONTENT);
        }
        else return new ResponseEntity<>(acc.get(),HttpStatus.OK);
    }
    public void createAccount(Account accinput){
        if (!accountRepo.existsById(accinput.getAccid()))
            accountRepo.save(accinput);
    }
//    xoa tai khoan
    public void deleteAccount(String username, String pass){
        for(Account acc : accountRepo.findAll()){
            if(acc.getUsername().equalsIgnoreCase(username) && acc.getPassword().equalsIgnoreCase(pass)){
                accountRepo.delete(acc);
            }
        }
    }
    //thay doi matkhau
    public void changePassword(String username, String pass, String newpass){
        for(Account acc : accountRepo.findAll()){
            if(acc.getUsername().equalsIgnoreCase(username) && acc.getPassword().equalsIgnoreCase(pass)){
                acc.setPassword(newpass);
            }
        }
    }

}
