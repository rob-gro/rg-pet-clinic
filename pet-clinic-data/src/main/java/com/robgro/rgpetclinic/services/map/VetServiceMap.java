package com.robgro.rgpetclinic.services.map;

import com.robgro.rgpetclinic.model.Specialize;
import com.robgro.rgpetclinic.model.Vet;
import com.robgro.rgpetclinic.services.SpecializeService;
import com.robgro.rgpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecializeService specializeService;

    public VetServiceMap(SpecializeService specializeService) {
        this.specializeService = specializeService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {

        if (object.getSpecializes().size() > 0) {
            object.getSpecializes().forEach(specialize -> {
                if (specialize.getId() == null) {
                    Specialize savedSpecialize = specializeService.save(specialize);
                    specialize.setId(savedSpecialize.getId());
                }
            });
        }
        return super.save(object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
