package com.etiya.rentacar.dataAccess.abstracts;

import com.etiya.rentacar.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand,Integer> {
}
