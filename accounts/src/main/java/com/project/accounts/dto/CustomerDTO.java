package com.project.accounts.dto;


import lombok.Data;

@Data
public class CustomerDTO {

    private String name;

    private String email;

    private String mobileNumber;

    private AccountsDTO accountDetails;
}
