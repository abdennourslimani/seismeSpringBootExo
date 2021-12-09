package dz.mycompany.seismeSpringBoot.dtos.localisation;

import dz.mycompany.seismeSpringBoot.entities.Seisme;

import java.util.List;

public class LocalisationSaveDTO {

    private String nom;
    private String code;


    public LocalisationSaveDTO() {
    }

    public LocalisationSaveDTO(String nom, String code) {
        this.nom = nom;
        this.code = code;

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


}
