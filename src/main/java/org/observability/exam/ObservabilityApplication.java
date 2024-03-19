package org.observability.exam;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ObservabilityApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ObservabilityApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

}
