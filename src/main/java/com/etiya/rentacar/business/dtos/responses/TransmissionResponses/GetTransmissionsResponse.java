package com.etiya.rentacar.business.dtos.responses.TransmissionResponses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetTransmissionsResponse {
    private List<String> transmissions;
}