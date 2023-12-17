package com.project.accounts.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description = "Scheme to hold customer and account information"
)
public class CustomerDTO {

    @NotEmpty(message = "Name cannot be null/empty")
    @Size(min = 5, max = 30, message = "Name length should be between 5 and 30")
    @Schema(
            description = "Name of the customer",
            example = "Foo Bar"
    )
    private String name;

    @NotEmpty(message = "email cannot be null/empty")
    @Email(message = "Email not valid")
    @Schema(
            description = "Email of the customer",
            example = "foo@bar.com"
    )
    private String email;

    @Pattern(regexp = "(^\\d{10}$)", message = "Mobile number should be 10 digits")
    @Schema(
            description = "Mobile Number of the customer",
            example = "7894561230"
    )
    private String mobileNumber;

    @Schema(
            description = "Account Details of the customer"
    )
    private AccountsDTO accountDetails;
}
