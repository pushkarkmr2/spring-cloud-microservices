package com.wipro.service;


import com.wipro.model.BankAccount;

import java.util.List;

public interface BankAccountService {

    List<BankAccount> findAll();
    BankAccount findById(int id);
    BankAccount save(BankAccount payment);
    void deleteById(int id);


}

