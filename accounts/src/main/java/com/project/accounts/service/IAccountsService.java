package com.project.accounts.service;

import com.project.accounts.dto.CustomerDTO;

public interface IAccountsService {

    void createAccount (CustomerDTO customerDTO);

    CustomerDTO fetchAccount(String mobileNumber);
}
