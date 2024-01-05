package com.etiya.rentacar.dataAccess.abstracts;

import com.etiya.rentacar.entities.concretes.Maintenance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaintenanceRepository extends JpaRepository<Maintenance,Integer> {
}
