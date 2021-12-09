package dz.mycompany.seismeSpringBoot.configurations;


import dz.mycompany.seismeSpringBoot.repositories.LocalisationRepositoryImpl;
import dz.mycompany.seismeSpringBoot.services.LocalisationService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LocalisationConfiguration {


    @Bean
    public LocalisationService localisationService(ModelMapper mapper,
                                                   LocalisationRepositoryImpl repository){
        return  new LocalisationService(mapper , repository);
    }
}
