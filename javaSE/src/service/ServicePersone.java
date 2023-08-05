package service;

import entetie.Personne;

import java.util.List;

public interface ServicePersone {
    Personne addPerson(Personne personne);
    List<Personne> getAllPerson();
    Personne getPersoneById(int id) ;

}
