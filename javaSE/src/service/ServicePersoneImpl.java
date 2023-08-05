package service;

import entetie.Personne;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ServicePersoneImpl implements ServicePersone {
    List<Personne> personneList = new ArrayList<>();
    @Override
    public Personne addPerson(Personne personne) {
        personneList.add(personne);
        return personne;
    }

    @Override
    public List<Personne> getAllPerson() {
        return personneList.stream().collect(Collectors.toList());
    }

    @Override
    public Personne getPersoneById(int id){
        try {
            return  personneList.stream().filter(personne -> personne.getIdd()==id).findFirst().get();
        }catch (RuntimeException e){
            System.out.println("Person not found !");
        }
        return null;
    }
}
