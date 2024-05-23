package com.wipro.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BankAccount {

    private  int id;
    private String accountNumber;
    private String accountType;
    private int userId;

}
