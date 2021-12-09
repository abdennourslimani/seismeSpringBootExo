package dz.mycompany.seismeSpringBoot.dtos.localisation;

import dz.mycompany.seismeSpringBoot.entities.Seisme;

import java.util.List;

public class LocalisationUpdateDTO {
    private String id;
    private String nom;
    private String code ;

    private List<SeismeRelationDTO> seismes;

    public LocalisationUpdateDTO() {
    }

    public LocalisationUpdateDTO(String id, String nom, String code, List<SeismeRelationDTO> seismes) {
        this.id = id;
        this.nom = nom;
        this.code = code;
        this.seismes = seismes;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<SeismeRelationDTO> getSeismes() {
        return seismes;
    }

    public void setSeismes(List<SeismeRelationDTO> seismes) {
        this.seismes = seismes;
    }
}
