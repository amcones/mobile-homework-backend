package pers.amcones.mobiletodo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("pers.amcones.mobiletodo.mapper")
public class MobiletodoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MobiletodoApplication.class, args);
    }

}
