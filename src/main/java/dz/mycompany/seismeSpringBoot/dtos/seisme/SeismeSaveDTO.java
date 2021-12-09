package dz.mycompany.seismeSpringBoot.dtos.seisme;



import org.springframework.data.mongodb.core.mapping.Document;

public class SeismeSaveDTO {

    private String nom;
    private String magnitude;
    private String Date;
    private LocalisationRelationDTO localisation;

    public SeismeSaveDTO() {
    }


    public SeismeSaveDTO(String nom, String magnitude, String date, LocalisationRelationDTO localisation) {
        this.nom = nom;
        this.magnitude = magnitude;
        Date = date;
        this.localisation = localisation;
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
