package com.owliance.oav;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.owliance.oav.controller", "com.owliance.oav.configuration",
        "com.owliance.oav.service", "com.owliance.oav.repository", "com.owliance.oav.configuration"})
@EntityScan("com.owliance.oav.vo")
@EnableJpaRepositories("com.owliance.oav.repository")
public class OavApp {

    public static void main(String[] args) {
        SpringApplication.run(OavApp.class, args);
    }

}
