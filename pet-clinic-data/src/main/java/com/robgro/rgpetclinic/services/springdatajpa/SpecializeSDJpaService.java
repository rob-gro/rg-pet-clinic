package com.robgro.rgpetclinic.services.springdatajpa;

import com.robgro.rgpetclinic.model.Specialize;
import com.robgro.rgpetclinic.repositories.SpecializeRepository;
import com.robgro.rgpetclinic.services.SpecializeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class SpecializeSDJpaService implements SpecializeService {

    private final SpecializeRepository specializeRepository;

    public SpecializeSDJpaService(SpecializeRepository specializeRepository) {
        this.specializeRepository = specializeRepository;
    }

    @Override
    public Set<Specialize> findAll() {
        Set<Specialize> specializes = new HashSet<>();
        specializeRepository.findAll().forEach(specializes::add);
        return specializes;
    }

    @Override
    public Specialize findById(Long aLong) {
        return specializeRepository.findById(aLong).orElse(null);
    }

    @Override
    public Specialize save(Specialize object) {
        return specializeRepository.save(object);
    }

    @Override
    public void delete(Specialize object) {
        specializeRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        specializeRepository.deleteById(aLong);
    }
}
