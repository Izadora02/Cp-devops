package br.com.tage.core;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import br.com.tage.core.model.Categoria;
import br.com.tage.core.model.ProfessorFacul;
import br.com.tage.core.repository.ProfessorFaculRepository;

@SpringBootApplication
public class CoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoreApplication.class, args);
    }

    @Bean
    public ApplicationRunner firstCarga(ProfessorFaculRepository repository) {
        return args -> {
            ProfessorFacul p1 = new ProfessorFacul("Ale", 20, "rua florio", 112223333, Categoria.CONCURSADO);
            repository.save(p1);
        };
    }

}