package dz.mycompany.seismeSpringBoot.controllers;

import dz.mycompany.seismeSpringBoot.dtos.localisation.LocalisationGetDTO;
import dz.mycompany.seismeSpringBoot.dtos.localisation.LocalisationSaveDTO;
import dz.mycompany.seismeSpringBoot.dtos.localisation.LocalisationUpdateDTO;
import dz.mycompany.seismeSpringBoot.dtos.seisme.LocalisationRelationGetDTO;
import dz.mycompany.seismeSpringBoot.dtos.seisme.SeismeGetDTO;
import dz.mycompany.seismeSpringBoot.dtos.seisme.SeismeSaveDTO;
import dz.mycompany.seismeSpringBoot.dtos.seisme.SeismeUpdateDTO;
import dz.mycompany.seismeSpringBoot.entities.Localisation;
import dz.mycompany.seismeSpringBoot.services.LocalisationService;
import dz.mycompany.seismeSpringBoot.services.SeismeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/localisation")
public class LocalisationController {

    private LocalisationService service ;

    public LocalisationController(LocalisationService service) {
        this.service = service;
    }



    @GetMapping()
    public List<LocalisationGetDTO> getLocalisations(){
        return  service.findAll() ;
    }


    @PostMapping()
    public LocalisationGetDTO save(@RequestBody LocalisationSaveDTO localisation){
        return  service.save(localisation) ;
    }


    @GetMapping ("/{id}")
    public ResponseEntity<String> findById(@PathVariable String id){
        LocalisationRelationGetDTO localisationFindDto = service.findById(id);
        if (localisationFindDto == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(localisationFindDto.getNom());

    }


    @DeleteMapping("/{id}")
    public  void deleteLocalisation (@PathVariable  String id){
        service.delete(id) ;

    }


    @PutMapping ()
    public LocalisationGetDTO updateSeisme(@RequestBody LocalisationUpdateDTO localisation){
        return  service.update(localisation) ;
    }









}
