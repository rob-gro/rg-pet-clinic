package com.robgro.rgpetclinic.bootstrap;

import com.robgro.rgpetclinic.model.*;
import com.robgro.rgpetclinic.services.OwnerService;
import com.robgro.rgpetclinic.services.PetTypeService;
import com.robgro.rgpetclinic.services.SpecializeService;
import com.robgro.rgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecializeService specializeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService,
                      SpecializeService specializeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specializeService = specializeService;
    }

    @Override
    public void run(String... args) throws Exception {

        int count = petTypeService.findAll().size();

        if (count == 0) {
            loadData();
        }
    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType saveDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType saveCatPetType = petTypeService.save(cat);

        Specialize radiology = new Specialize();
        radiology.setDescription("Radiology");
        Specialize savedRadiology = specializeService.save(radiology);

        Specialize surgery = new Specialize();
        surgery.setDescription("Surgery");
        Specialize savedSurgery = specializeService.save(surgery);

        Specialize dentistry = new Specialize();
        dentistry.setDescription("Dentistry");
        Specialize savedDentistry = specializeService.save(dentistry);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123 Bickerer");
        owner1.setCity("Miami");
        owner1.setTelephone("123123654");

        Pet mikesPet = new Pet();
        mikesPet.setPetType(saveDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Rosco");
        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("123 Bickerer");
        owner2.setCity("Miami");
        owner2.setTelephone("123123654");

        Pet fionasPet = new Pet();
        fionasPet.setPetType(saveCatPetType);
        fionasPet.setOwner(owner2);
        fionasPet.setBirthDate(LocalDate.now());
        fionasPet.setName("just cat");
        owner2.getPets().add(fionasPet);

        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vet1.getSpecializes().add(savedRadiology);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");
        vet2.getSpecializes().add(savedSurgery);

        vetService.save(vet2);

        System.out.println("Loaded Vets....");
    }
}