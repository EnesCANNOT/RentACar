package com.etiya.rentacar.business.rules;

import com.etiya.rentacar.core.exceptions.types.BusinessException;
import com.etiya.rentacar.dataAccess.abstracts.BrandRepository;
import com.etiya.rentacar.entities.Brand;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class BrandBusinessRules {
    private BrandRepository brandRepository;

    public void brandNameCannotBeDuplicated(String brandName) {
        Optional<Brand> foundBrand = brandRepository.findByNameIgnoreCase(brandName);

        if (foundBrand.isPresent() && foundBrand.get().getDeletedDate() == null) {
            throw new BusinessException("This brand already exists");
        }
    }

    public void brandNotFound(long brandId) {
        Optional<Brand> foundBrand = brandRepository.findById(brandId);

        if (!foundBrand.isPresent()) {
            throw new BusinessException("There is no brand with this id");
        }
    }

    public void deletedBrand(long id) {
        Brand foundBrand = brandRepository.findById(id).orElse(null);

        if (foundBrand.getDeletedDate() != null) {
            throw new BusinessException("This brand is deleted");
        }
    }
}