package com.project.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Schema(
        name = "Error Response",
        description = "Schema to hold error response information"
)
public class ErrorResponseDTO {

    @Schema(
            description = "API path invoked by client"
    )
    private String apiPath;

    @Schema(
            description = "Error Code representing the error happened"
    )
    private HttpStatus errorCode;

    @Schema(
            description = "Error Message representing the error happened"
    )
    private String errorMessage;

    @Schema(
            description = "Error Time representing when error happened"
    )
    private LocalDateTime errorTime;
}
