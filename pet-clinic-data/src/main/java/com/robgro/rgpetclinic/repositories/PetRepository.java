package com.robgro.rgpetclinic.repositories;

import com.robgro.rgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
