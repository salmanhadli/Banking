package com.project.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Schema(
        name = "Response",
        description = "Schema to hold successful responsible information"
)
public class ResponseDTO {
    @Schema(
            description = "Status Code in the response"
    )
    private String statusCode;

    @Schema(
            description = "Status Message in the response"
    )
    private String statusMessage;
}
