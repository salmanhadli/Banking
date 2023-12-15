package com.project.accounts.controller;


import com.project.accounts.constants.AccountConstants;
import com.project.accounts.dto.CustomerDTO;
import com.project.accounts.dto.ResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api", produces = {MediaType.APPLICATION_JSON_VALUE})
public class AccountsController {
//    @GetMapping("sayHello")
//    public String sayHello() {
//        return "Hi, Hello World!";
//    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> createAccount(@RequestBody CustomerDTO customerDTO) {

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body((new ResponseDTO(AccountConstants.STATUS_201, AccountConstants.MESSAGE_201)));
    }
}
