package com.etiya.rentacar.business.rules;

import com.etiya.rentacar.business.messages.BrandMessages;
import com.etiya.rentacar.core.utilities.exceptions.types.BusinessException;
import com.etiya.rentacar.dataAccess.abstracts.BrandRepository;
import com.etiya.rentacar.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class BrandBusinessRules {
    BrandRepository brandRepository;
    public void brandNameCanNotBeDuplicated(String brandName){
        Optional<Brand> brand = brandRepository.findByNameIgnoreCase(brandName);
        if (brand.isPresent()){
            throw new BusinessException(BrandMessages.brandNameAlreadyExists);
        }
    }
}
