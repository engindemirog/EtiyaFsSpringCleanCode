package com.etiya.rentacar.business.abstracts;

import com.etiya.rentacar.business.dtos.requests.CreateMaintenanceRequest;
import com.etiya.rentacar.business.dtos.responses.CreatedMaintenanceResponse;

public interface MaintenanceService {
    CreatedMaintenanceResponse add(CreateMaintenanceRequest createMaintenanceRequest);
}

//1:Add Maintenance -> bakımda olan araç veya kirada olan araç bakıma gönderilemez
//BI: CarService
//2:Update Car

