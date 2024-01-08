package org.jennifer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner{
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
    private WikimediaChangesProducer wikimediaChangesProducer;

    public Main(WikimediaChangesProducer wikimediaChangesProducer) {
        this.wikimediaChangesProducer = wikimediaChangesProducer;
    }

    @Override
    public void run(String... args) throws Exception {
        wikimediaChangesProducer.sendMessage();

    }
}