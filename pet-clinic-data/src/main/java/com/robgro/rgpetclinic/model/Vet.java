package com.robgro.rgpetclinic.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "vets")
public class Vet extends Person{

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "vets_specializes", joinColumns = @JoinColumn(name = "vet_id"),
                                    inverseJoinColumns = @JoinColumn(name = "specialize_id"))
    private Set<Specialize> specializes = new HashSet<>();

    public Set<Specialize> getSpecializes() {
        return specializes;
    }

    public void setSpecializes(Set<Specialize> specializes) {
        this.specializes = specializes;
    }
}
