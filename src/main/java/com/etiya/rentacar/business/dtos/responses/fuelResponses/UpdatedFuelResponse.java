package com.etiya.rentacar.business.dtos.responses.fuelResponses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdatedFuelResponse {
    private long id;
    private String name;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
}
