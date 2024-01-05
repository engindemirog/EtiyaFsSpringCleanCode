package com.etiya.rentacar.entities.concretes;

import com.etiya.rentacar.core.entities.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="cars")
public class Car extends BaseEntity<Integer> {
    @Column(name="modelYear")
    private int modelYear;
    @Column(name="plate")
    private String plate;
    @Column(name="state")//1-Available 2-Rented 3-Under Maintenance
    private int state;
    @Column(name="dailyPrice")
    private double dailyPrice;
    @ManyToOne()
    @JoinColumn(name="model_id")
    private Model model;

    @OneToMany(mappedBy = "car")
    private List<Maintenance> maintenances;
}
