package com.etiya.rentacar.business.concretes;

import com.etiya.rentacar.business.abstracts.MaintenanceService;
import com.etiya.rentacar.business.dtos.requests.CreateMaintenanceRequest;
import com.etiya.rentacar.business.dtos.responses.CreatedCarResponse;
import com.etiya.rentacar.business.dtos.responses.CreatedMaintenanceResponse;
import com.etiya.rentacar.core.utilities.mapping.ModelMapperService;
import com.etiya.rentacar.dataAccess.abstracts.CarRepository;
import com.etiya.rentacar.dataAccess.abstracts.MaintenanceRepository;
import com.etiya.rentacar.entities.concretes.Car;
import com.etiya.rentacar.entities.concretes.Maintenance;

import java.time.LocalDateTime;

public class MaintenanceManager implements MaintenanceService {
    private MaintenanceRepository maintenanceRepository;
    private ModelMapperService modelMapperService;
    @Override
    public CreatedMaintenanceResponse add(CreateMaintenanceRequest createMaintenanceRequest) {
        Maintenance maintenance = this.modelMapperService.forRequest().map(createMaintenanceRequest,Maintenance.class);

        maintenance.setCreatedDate(LocalDateTime.now());
        maintenance.setDateSent(LocalDateTime.now());


        Maintenance createdMaintenance = maintenanceRepository.save(maintenance);

        CreatedMaintenanceResponse createdMaintenanceResponse = this.modelMapperService.forResponse()
                .map(createdMaintenance,CreatedMaintenanceResponse.class);

        return createdMaintenanceResponse;
    }
}
