package dz.mycompany.seismeSpringBoot.repositories;

import dz.mycompany.seismeSpringBoot.entities.Localisation;
import dz.mycompany.seismeSpringBoot.entities.Seisme;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface LocalisationRepositoryImpl extends MongoRepository<Localisation, String> {
}
