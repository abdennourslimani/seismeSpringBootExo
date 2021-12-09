package dz.mycompany.seismeSpringBoot.configurations;


import dz.mycompany.seismeSpringBoot.entities.Seisme;
import dz.mycompany.seismeSpringBoot.repositories.SeismeRepositoryImpl;
import dz.mycompany.seismeSpringBoot.services.SeismeService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SeismeConfiguration {


    @Bean
    public SeismeService seismeService(ModelMapper mapper,
                                       SeismeRepositoryImpl repository){
            return  new SeismeService(mapper , repository);
    }

}
