package com.jsun.project.boardadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan // configuration class에 configuration 이 있는지 스캔
@SpringBootApplication
public class JsunProjectBoardAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(JsunProjectBoardAdminApplication.class, args);
    }

}
