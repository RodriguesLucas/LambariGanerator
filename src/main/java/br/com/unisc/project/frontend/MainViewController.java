package br.com.unisc.project.frontend;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MainViewController implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        try {
            System.setProperty("java.awt.headless", "false");
            new FirstInterface();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
