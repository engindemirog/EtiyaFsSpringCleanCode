package com.etiya.rentacar.business.abstracts;

import com.etiya.rentacar.business.dtos.requests.CreateBrandRequest;
import com.etiya.rentacar.business.dtos.responses.CreatedBrandResponse;
import com.etiya.rentacar.business.dtos.responses.GetAllBrandResponse;
import com.etiya.rentacar.entities.concretes.Brand;

import java.util.List;

public interface BrandService {
    CreatedBrandResponse add(CreateBrandRequest createBrandRequest);
    List<GetAllBrandResponse> getAll();
}
