import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Entity;

@SpringBootApplication
@ComponentScan(basePackages = {"com.karamveer.*"})
@EntityScan(basePackages = {"com.karamveer.*"})
@EnableJpaRepositories(basePackages = {"com.karamveer.*"})
public class HospitalManagementSystem {

    public static void main(String args[]){
        SpringApplication.run(HospitalManagementSystem.class);
    }

}
