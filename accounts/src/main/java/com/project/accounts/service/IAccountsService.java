package com.project.accounts.service;

import com.project.accounts.dto.CustomerDTO;

public interface IAccountsService {

    void createAccount (CustomerDTO customerDTO);

    CustomerDTO fetchAccount(String mobileNumber);

    boolean updateAccount(CustomerDTO customerDTO);

    boolean deleteAccount(String mobileNumber);
}
