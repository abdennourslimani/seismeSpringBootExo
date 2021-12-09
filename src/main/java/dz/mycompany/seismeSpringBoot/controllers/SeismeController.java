


package dz.mycompany.seismeSpringBoot.controllers;

import dz.mycompany.seismeSpringBoot.dtos.seisme.SeismeGetDTO;
import dz.mycompany.seismeSpringBoot.dtos.seisme.SeismeSaveDTO;
import dz.mycompany.seismeSpringBoot.dtos.seisme.SeismeUpdateDTO;
import dz.mycompany.seismeSpringBoot.services.SeismeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seismes")
public class SeismeController {


    //    @Autowired si on met ça on passe pas par le constructeur .
    private SeismeService service;

    public SeismeController(SeismeService service) {
        this.service = service;
    }


    @GetMapping()
    public List<SeismeGetDTO> getSeismes() {
        return service.findAll();
    }


    @PostMapping()
    public SeismeGetDTO save(@RequestBody SeismeSaveDTO seisme) {
        return service.save(seisme);
    }


    @GetMapping("/{id}")
    public ResponseEntity<SeismeGetDTO> findById(@PathVariable String id) {
        SeismeGetDTO seismeFindDto = service.findById(id);
        if (seismeFindDto == null) {
            return ResponseEntity.notFound().build();

        }

        return ResponseEntity.ok().body(seismeFindDto);

    }


    @DeleteMapping("/{id}")
    public void deleteSeisme(@PathVariable String id) {
        service.delete(id);
    }


    @PutMapping()
    public SeismeGetDTO updateSeisme(@RequestBody SeismeUpdateDTO seisme) {
        return service.update(seisme);
    }

}
