package com.etiya.rentacar.business.dtos.requests.modelRequests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateModelRequest {
    @NotEmpty
    @NotBlank
    @Size(min = 2, max = 30)
    private String name;

    @NotNull
    @NotEmpty
    @NotBlank
    private long fuelId;

    @NotNull
    @NotEmpty
    @NotBlank
    private long transmissionId;

    @NotNull
    private long brandID;
}
