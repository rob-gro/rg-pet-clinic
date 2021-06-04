package com.robgro.rgpetclinic.model;

import java.util.Set;

public class Vet extends Person{

    private Set<Specialize> specializes;

    public Set<Specialize> getSpecializes() {
        return specializes;
    }

    public void setSpecializes(Set<Specialize> specializes) {
        this.specializes = specializes;
    }
}
