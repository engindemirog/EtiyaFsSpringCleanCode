package com.etiya.rentacar.api.controllers;

import com.etiya.rentacar.business.abstracts.CarService;
import com.etiya.rentacar.business.dtos.requests.CreateBrandRequest;
import com.etiya.rentacar.business.dtos.requests.CreateCarRequest;
import com.etiya.rentacar.business.dtos.responses.CreatedBrandResponse;
import com.etiya.rentacar.business.dtos.responses.CreatedCarResponse;
import com.etiya.rentacar.business.dtos.responses.GetAllBrandResponse;
import com.etiya.rentacar.business.dtos.responses.GetAllCarResponse;
import com.etiya.rentacar.core.business.paging.PageInfo;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/cars")
public class CarsController {
    private CarService carService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreatedCarResponse add(@Valid @RequestBody CreateCarRequest createCarRequest){
        return carService.add(createCarRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<GetAllCarResponse> getAll(@RequestParam int page, @RequestParam int size){
        PageInfo pageInfo = new PageInfo(page,size);
        return carService.getAll(pageInfo);
    }
}
