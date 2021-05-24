package com.robgro.rgpetclinic.services;

import com.robgro.rgpetclinic.model.Owner;

public interface OwnerService extends  CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
