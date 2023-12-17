package com.project.accounts.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CustomerDTO {

    @NotEmpty(message = "Name cannot be null/empty")
    @Size(min = 5, max = 30, message = "Name length should be between 5 and 30")
    private String name;

    @NotEmpty(message = "email cannot be null/empty")
    @Email(message = "Email not valid")
    private String email;

    @Pattern(regexp = "(^\\d{10}$)", message = "Mobile number should be 10 digits")
    private String mobileNumber;

    private AccountsDTO accountDetails;
}
