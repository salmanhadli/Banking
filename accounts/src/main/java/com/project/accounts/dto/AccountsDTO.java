package com.project.accounts.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Scheme to hold account information"
)
public class AccountsDTO {

    @Pattern(regexp = "(^\\d{10}$)", message = "Account number should be 10 digits")
    @Schema(
            description = "Account Number of the bank account",
            example = "7894561230"
    )
    private Long accountNumber;

    @NotEmpty(message = "Account type cannot be empty")
    @Schema(
            description = "Account Type of the bank account",
            example = "Savings"
    )
    private String accountType;

    @NotEmpty(message = "Branch address cannot be empty")
    @Schema(
            description = "Branch Address of the account",
            example = "123 New York"
    )
    private String branchAddress;
}
