package com.example.demo.controller;


import com.example.demo.model.Cashier;
import com.example.demo.model.Customer;
import com.example.demo.repository.CashierRepository;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/cashiers")
public class CashierController {

    @Autowired
    private CashierRepository cashierRepository;

    @GetMapping
    public List<Cashier> getAllCashiers(){
        return cashierRepository.findAll();
    }

    // build create customer REST API
    @PostMapping
    public Cashier createCashier(@RequestBody Cashier cashier){
        return cashierRepository.save(cashier);
    }

}
