package dz.mycompany.seismeSpringBoot.services;

import dz.mycompany.seismeSpringBoot.dtos.localisation.LocalisationGetDTO;
import dz.mycompany.seismeSpringBoot.dtos.localisation.LocalisationSaveDTO;
import dz.mycompany.seismeSpringBoot.dtos.localisation.LocalisationUpdateDTO;
import dz.mycompany.seismeSpringBoot.dtos.seisme.LocalisationRelationGetDTO;
import dz.mycompany.seismeSpringBoot.entities.Localisation;
import dz.mycompany.seismeSpringBoot.repositories.LocalisationRepositoryImpl;
import org.modelmapper.ModelMapper;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LocalisationService {
    LocalisationRelationGetDTO localisationGetDTO = null;
    private LocalisationRepositoryImpl repository;
    private ModelMapper mapper;

    public LocalisationService(ModelMapper mapper,
                               LocalisationRepositoryImpl repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    public List<LocalisationGetDTO> findAll() {
        List<LocalisationGetDTO> localisations = new ArrayList<>();
        repository.findAll().forEach(loc -> {
            localisations.add(mapper.map(loc, LocalisationGetDTO.class));
        });
        return localisations;
    }


    /**
     * save localisation and return object savec
     *
     * @param localisation LocalisationsaveDTO
     * @return localisationGetDto
     */

    public LocalisationGetDTO save(LocalisationSaveDTO localisation) {
        return this.mapper.map(
                repository.save(
                        mapper.map(localisation, Localisation.class)), LocalisationGetDTO.class);
    }

    /**
     * delete localisation
     *
     * @param id
     */
    public void delete(String id) {
        repository.deleteById(id);

    }

    /**
     * updata dto
     *
     * @param localisation
     * @return localisationGetDTO
     */
    public LocalisationGetDTO update(LocalisationUpdateDTO localisation) {
        return mapper.map(
                repository.save(
                        mapper.map(localisation, Localisation.class)), LocalisationGetDTO.class);

    }

    /**
     * find by id localisation .
     *
     * @param id
     * @return
     */
    public LocalisationRelationGetDTO findById(String id) {

        Optional<Localisation> localisationFound = repository.findById(id);
        if (localisationFound.isPresent()) {
            localisationGetDTO = mapper.map(localisationFound, LocalisationRelationGetDTO.class);
        }
        return localisationGetDTO ;
    }


}
