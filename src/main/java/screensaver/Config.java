package screensaver;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.awt.*;
import java.util.Random;

@Configuration
public class Config {
    @Bean
    public Color color(){
        Random random = new Random();
        return new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255));
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        while (true) {
            context.getBean(ColorFrame.class).showOnRandomPlace();
        }
    }
}
