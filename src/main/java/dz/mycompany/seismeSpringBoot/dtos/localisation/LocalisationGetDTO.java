package dz.mycompany.seismeSpringBoot.dtos.localisation;


import dz.mycompany.seismeSpringBoot.dtos.seisme.SeismeGetDTOLight;



import java.util.List;

public class LocalisationGetDTO {

    private String id;
    private String nom;
    private String code;

    private List<SeismeGetDTOLight> seismes;

    public LocalisationGetDTO() {
    }

    public LocalisationGetDTO(String id, String nom, String code, List<SeismeGetDTOLight> seismes) {
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

    public List<SeismeGetDTOLight> getSeismes() {
        return seismes;
    }

    public void setSeismes(List<SeismeGetDTOLight> seismes) {
        this.seismes = seismes;
    }
}
