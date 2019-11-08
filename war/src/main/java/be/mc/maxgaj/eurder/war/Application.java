package be.mc.maxgaj.eurder.war;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "be.mc.maxgaj.eurder")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
