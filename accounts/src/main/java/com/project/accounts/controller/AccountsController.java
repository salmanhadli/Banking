package com.project.accounts.controller;


import com.project.accounts.constants.AccountConstants;
import com.project.accounts.dto.CustomerDTO;
import com.project.accounts.dto.ResponseDTO;
import com.project.accounts.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api", produces = {MediaType.APPLICATION_JSON_VALUE})
@AllArgsConstructor //will add contructor injection
public class AccountsController {

//    @Autowired // property injection, not needed due to @AllArgsConstructor
    private IAccountsService iAccountsService;

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> createAccount(@RequestBody CustomerDTO customerDTO) {
        this.iAccountsService.createAccount(customerDTO);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body((new ResponseDTO(AccountConstants.STATUS_201, AccountConstants.MESSAGE_201)));
    }

    @GetMapping("/fetch")
    public ResponseEntity<CustomerDTO> fetchAccountDetails(@RequestParam String mobileNumber) {
        CustomerDTO customerDTO = iAccountsService.fetchAccount(mobileNumber);
        return  ResponseEntity.status(HttpStatus.OK).body(customerDTO);
    }
}
