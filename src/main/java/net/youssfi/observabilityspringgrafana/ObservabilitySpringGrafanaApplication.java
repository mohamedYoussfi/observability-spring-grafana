package net.youssfi.observabilityspringgrafana;

import net.youssfi.observabilityspringgrafana.entities.Product;
import net.youssfi.observabilityspringgrafana.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ObservabilitySpringGrafanaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ObservabilitySpringGrafanaApplication.class, args);
    }


    @Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository){
        return args -> {
            productRepository.save(Product.builder().name("Computer").price(23000).build());
            productRepository.save(Product.builder().name("Smart Phone").price(1200).build());
            productRepository.save(Product.builder().name("Printer").price(300).build());
            productRepository.findAll().forEach(System.out::println);
        };
    }
}
