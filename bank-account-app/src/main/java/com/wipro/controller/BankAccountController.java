package com.wipro.controller;

import com.wipro.model.BankAccount;
import com.wipro.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class BankAccountController {

    @Autowired
    private BankAccountService bankAccountService;

    @GetMapping("/account")
    public List<BankAccount> findAll() {
        return bankAccountService.findAll();
    }

    @GetMapping("/account/{id}")
    public BankAccount findById(@PathVariable int id) {
        return bankAccountService.findById(id);
    }

    @PostMapping("/account")
    public BankAccount save(@RequestBody BankAccount payment) {
        return bankAccountService.save(payment);
    }

    @DeleteMapping("/account/{id}")
    public void deleteById(@PathVariable int id) {
        bankAccountService.deleteById(id);
    }

    @PutMapping("/account")
    public void update(@RequestBody BankAccount payment) {
        bankAccountService.save(payment);

    }
}


