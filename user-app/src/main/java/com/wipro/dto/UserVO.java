package com.wipro.dto;

import com.wipro.model.User;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserVO {

    private User user;
    private BankAccount bankAccount;

}
