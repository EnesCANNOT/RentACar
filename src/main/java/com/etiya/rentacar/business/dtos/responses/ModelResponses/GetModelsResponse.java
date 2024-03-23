package com.etiya.rentacar.business.dtos.responses.ModelResponses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetModelsResponse {
    private List<String> modelNames;
}