package com.wipro.service.impl;

import com.wipro.model.BankAccount;
import com.wipro.repository.BankAccountRepository;
import com.wipro.service.BankAccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BankAccountServiceImpl implements BankAccountService {

    private static final Logger log = LoggerFactory.getLogger(BankAccountServiceImpl.class);

    @Autowired
    BankAccountRepository bankAccountRepository;

    @Override
    public List<BankAccount> findAll() {
        log.info("Retrieving list of bank accounts present");
        return bankAccountRepository.findAll();
    }

    @Override
    public BankAccount findById(int id) {
        log.info("Retrieving bank account for a given Id");
        return bankAccountRepository.findById(id).get();
    }

    @Override
    public BankAccount save(BankAccount bankAccount) {
        log.info("Creating an account in database");
        return bankAccountRepository.save(bankAccount);
    }

    @Override
    public void deleteById(int id) {
        log.info("Deleting a bank account for given Id");
        bankAccountRepository.deleteById(id);
    }
}
