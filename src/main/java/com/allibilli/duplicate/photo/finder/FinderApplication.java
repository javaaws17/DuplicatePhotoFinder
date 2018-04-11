package com.allibilli.duplicate.photo.finder;

import com.allibilli.duplicate.photo.finder.structure.ReadFilesFrom;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Optional;

@SpringBootApplication
@Slf4j
public class FinderApplication {

    @Autowired
    ReadFilesFrom readFilesFrom;

    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext context = SpringApplication.run(FinderApplication.class, args);

        FinderApplication application = context.getBean(FinderApplication.class);
        application.start();
    }

    public void start() throws Exception {
        readFilesFrom.read(Optional.empty());
    }

}
