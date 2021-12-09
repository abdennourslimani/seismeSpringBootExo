package dz.mycompany.seismeSpringBoot.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Seisme {

    @Id
    private String id;
    private String nom;
    private String magnitude;
    private String Date;
    @DBRef
    private Localisation localisation;

    public Seisme() {
    }

    public Seisme(String id, String nom, String magnitude, String date, Localisation localisation) {
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

    public Localisation getLocalisation() {
        return localisation;
    }

    public void setLocalisation(Localisation localisation) {
        this.localisation = localisation;
    }
}
