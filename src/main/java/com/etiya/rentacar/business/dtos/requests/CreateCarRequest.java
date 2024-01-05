package com.etiya.rentacar.business.dtos.requests;

import com.etiya.rentacar.entities.concretes.Model;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateCarRequest {
    private int modelYear;
    private String plate;
    private double dailyPrice;
    private int modelId;
}

