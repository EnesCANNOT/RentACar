package com.etiya.rentacar.business.dtos.requests.rentalRequests;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Optional;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateRentalRequest {
    @NotNull
    @Min(1)
    private long carId;

    @NotNull
    @Min(1)
    private long customerId;

    @FutureOrPresent
    private LocalDateTime StartDate;

    @FutureOrPresent
    private LocalDateTime EndDate;
}
