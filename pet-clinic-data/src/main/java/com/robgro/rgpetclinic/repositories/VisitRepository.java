package com.robgro.rgpetclinic.repositories;

import com.robgro.rgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
