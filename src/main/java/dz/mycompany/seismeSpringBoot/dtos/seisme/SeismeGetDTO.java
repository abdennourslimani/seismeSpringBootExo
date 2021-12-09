package dz.mycompany.seismeSpringBoot.dtos.seisme;

import dz.mycompany.seismeSpringBoot.dtos.localisation.LocalisationGetDTO;


public class SeismeGetDTO {

    private String id;
    private String nom;
    private String magnitude;
    private String Date;
    private LocalisationRelationGetDTO localisation;

    public SeismeGetDTO() {
    }

    public SeismeGetDTO(String id, String nom, String magnitude, String date, LocalisationRelationGetDTO localisation) {
        this.id = id;
        this.nom = nom;
        this.magnitude = magnitude;
        this.Date = date;
        this.localisation = localisation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(String magnitude) {
        this.magnitude = magnitude;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public LocalisationRelationGetDTO getLocalisation() {
        return localisation;
    }

    public void setLocalisation(LocalisationRelationGetDTO localisation) {
        this.localisation = localisation;
    }
}
