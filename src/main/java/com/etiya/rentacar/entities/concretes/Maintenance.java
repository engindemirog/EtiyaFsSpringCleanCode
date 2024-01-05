package com.etiya.rentacar.entities.concretes;

import com.etiya.rentacar.core.entities.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="maintenances")
public class Maintenance extends BaseEntity<Integer> {
    @Column(name="dateSent")
    private LocalDateTime dateSent;
    @Column(name="dateReturned")
    private LocalDateTime dateReturned;

    @ManyToOne()
    @JoinColumn(name="car_id")
    private Car car;
}
