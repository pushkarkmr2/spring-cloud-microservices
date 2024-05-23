package com.wipro.service.impl;

import com.wipro.dto.BankAccount;
import com.wipro.dto.UserVO;
import com.wipro.model.User;
import com.wipro.repository.UserRepository;
import com.wipro.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    UserRepository userRepository;

    @Autowired
    RestTemplate restTemplate;

    @Override
    public void save(UserVO userObject) {

        User user = userRepository.save(userObject.getUser());
        String url = "http://BANK-ACCOUNT-APP/account";
        BankAccount bankAccount = userObject.getBankAccount();
        bankAccount.setUserId(user.getId());

        ResponseEntity<BankAccount> response = restTemplate.postForEntity(url,bankAccount, BankAccount.class);
        if (response.getStatusCode().value() == 200 && response.getBody()!= null){
            log.info("Bank Account : {} " , response.getBody());
        }
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(int id) {
        return userRepository.findById(id).get();
    }

    @Override
    public void deleteById(int id) {
        userRepository.deleteById(id);
    }
}

