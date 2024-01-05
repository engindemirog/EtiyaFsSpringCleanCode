package com.etiya.rentacar.business.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GetAllCarResponse {
    private int id;
    private int modelYear;
    private String plate;
    private double dailyPrice;
    private int modelId;
    private LocalDateTime createdDate;
    private int state;
    private String fuelName;
    private String transmissionName;
    private String modelName;
}
