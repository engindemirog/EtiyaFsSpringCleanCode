package com.etiya.rentacar.business.concretes;

import com.etiya.rentacar.business.abstracts.CarService;
import com.etiya.rentacar.business.dtos.requests.CreateCarRequest;
import com.etiya.rentacar.business.dtos.responses.CreatedBrandResponse;
import com.etiya.rentacar.business.dtos.responses.CreatedCarResponse;
import com.etiya.rentacar.business.dtos.responses.GetAllBrandResponse;
import com.etiya.rentacar.business.dtos.responses.GetAllCarResponse;
import com.etiya.rentacar.business.rules.BrandBusinessRules;
import com.etiya.rentacar.core.business.paging.PageInfo;
import com.etiya.rentacar.core.utilities.mapping.ModelMapperService;
import com.etiya.rentacar.dataAccess.abstracts.BrandRepository;
import com.etiya.rentacar.dataAccess.abstracts.CarRepository;
import com.etiya.rentacar.entities.concretes.Brand;
import com.etiya.rentacar.entities.concretes.Car;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class CarManager implements CarService {
    private CarRepository carRepository;
    private ModelMapperService modelMapperService;
    //private BrandBusinessRules brandBusinessRules;
    @Override
    public CreatedCarResponse add(CreateCarRequest createCarRequest) {
        Car car = this.modelMapperService.forRequest().map(createCarRequest,Car.class);

        car.setCreatedDate(LocalDateTime.now());
        car.setState(1);
        Car createdCar = carRepository.save(car);

        CreatedCarResponse createdCarResponse = this.modelMapperService.forResponse()
                .map(createdCar,CreatedCarResponse.class);

        return createdCarResponse;
    }

    @Override
    public List<GetAllCarResponse> getAll(PageInfo pageInfo) {


        PageRequest pageRequest = PageRequest.of(pageInfo.getPage(), pageInfo.getSize());
        List<Car> cars = carRepository.findAll(pageRequest).getContent();

        List<GetAllCarResponse> response = cars.stream().map(car ->
                this.modelMapperService.forResponse()
                        .map(car, GetAllCarResponse.class)).collect(Collectors.toList());

        return response;
    }
}
