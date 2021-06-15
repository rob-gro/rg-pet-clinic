package com.robgro.rgpetclinic.repositories;

import com.robgro.rgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
