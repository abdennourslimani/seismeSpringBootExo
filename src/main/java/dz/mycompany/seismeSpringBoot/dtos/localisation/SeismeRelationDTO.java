package dz.mycompany.seismeSpringBoot.dtos.localisation;

public class SeismeRelationDTO {
    private String id ;

    public SeismeRelationDTO() {
    }

    public SeismeRelationDTO(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
