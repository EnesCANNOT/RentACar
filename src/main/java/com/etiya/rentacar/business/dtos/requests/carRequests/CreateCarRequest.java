package com.etiya.rentacar.business.dtos.requests.carRequests;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCarRequest {
    @NotNull
    @Min(2000)
    @Max(2024)
    private int modelYear;

    @NotNull
    @Min(1)
    @Max(3)
    private int state;

    @NotNull
    private int kilometer;

    @NotBlank
    @NotEmpty
    @Size(min = 7, max = 9)
    @Pattern(regexp = "^[0-9]{2}[A-Z]{1,3}[0-9]{1,4}$\n")
    private String plate;

    @NotNull
    @Min(1000)
    private double dailyPrice;

    @NotNull
    @Min(1)
    private long modelId;
}
