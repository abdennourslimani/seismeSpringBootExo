package dz.mycompany.seismeSpringBoot.services;

import dz.mycompany.seismeSpringBoot.dtos.seisme.SeismeDeleteDTO;
import dz.mycompany.seismeSpringBoot.dtos.seisme.SeismeGetDTO;
import dz.mycompany.seismeSpringBoot.dtos.seisme.SeismeSaveDTO;
import dz.mycompany.seismeSpringBoot.dtos.seisme.SeismeUpdateDTO;
import dz.mycompany.seismeSpringBoot.repositories.SeismeRepositoryImpl;
import dz.mycompany.seismeSpringBoot.entities.Seisme;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SeismeService {

    private SeismeRepositoryImpl repository;
    private ModelMapper mapper;

    public SeismeService(ModelMapper mapper,
                         SeismeRepositoryImpl repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    public List<SeismeGetDTO> findAll() {
        List<SeismeGetDTO> seismes = new ArrayList<>();
        repository.findAll().forEach(post -> {
            seismes.add(mapper.map(post, SeismeGetDTO.class));
        });
        return seismes;
    }

    /**
     * save Seisme DTO
     *
     * @param seisme
     * @return
     */
    public SeismeGetDTO save(SeismeSaveDTO seisme) {
        Seisme p = this.repository.save(this.mapper.map(seisme, Seisme.class));
        return this.mapper.map(p, SeismeGetDTO.class);
    }

    /**
     * delete Seisme
     *
     * @param id
     */
    public void delete(String id) {
        repository.deleteById(id);

    }

    /**
     * update Seisme DTO
     *
     * @param seisme
     * @return
     */
    public SeismeGetDTO update(SeismeUpdateDTO seisme) {

        return mapper.map(
                repository.save(
                        mapper.map(seisme, Seisme.class)), SeismeGetDTO.class);

    }


    /**
     * seisme find by ID
     * @param id
     * @return SeismeGETDTO
     */
    public SeismeGetDTO findById(String id) {
        SeismeGetDTO seismeGetDTO = null;
        Optional<Seisme> seismeFound = repository.findById(id);
        if (seismeFound.isPresent()) {
            seismeGetDTO = mapper.map(seismeFound.get(), SeismeGetDTO.class);
        }
        return seismeGetDTO;
    }


};