package com.robgro.rgpetclinic.services.map;

import com.robgro.rgpetclinic.model.Specialize;
import com.robgro.rgpetclinic.services.SpecializeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SpecializeMapService extends AbstractMapService<Specialize, Long> implements SpecializeService {
    @Override
    public Set<Specialize> findAll() {
        return super.findAll();
    }

    @Override
    public Specialize findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Specialize save(Specialize object) {
        return super.save(object);
    }

    @Override
    public void delete(Specialize object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
