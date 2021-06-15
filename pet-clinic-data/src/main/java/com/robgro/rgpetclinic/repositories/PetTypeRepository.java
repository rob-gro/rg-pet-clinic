package com.robgro.rgpetclinic.repositories;

import com.robgro.rgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
