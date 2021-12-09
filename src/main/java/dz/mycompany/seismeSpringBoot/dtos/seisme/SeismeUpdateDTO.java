package dz.mycompany.seismeSpringBoot.dtos.seisme;

public class SeismeUpdateDTO {
    private String id ;
    private String nom;
    private String magnitude;
    private String Date;
    private LocalisationRelationDTO localisation;

    public SeismeUpdateDTO() {
    }

    public SeismeUpdateDTO(String id, String nom, String magnitude, String date, LocalisationRelationDTO localisation) {
        this.id = id;
        this.nom = nom;
        this.magnitude = magnitude;
        Date = date;
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

    public LocalisationRelationDTO getLocalisation() {
        return localisation;
    }

    public void setLocalisation(LocalisationRelationDTO localisation) {
        this.localisation = localisation;
    }
}
